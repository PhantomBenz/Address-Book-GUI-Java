package addressbook.controller;

public class Service {
    private Contact root;

    private int height (Contact curr) {
        if(curr == null) {
            return 0;
        }
        return curr.height;
    }

    private Contact rightRotate (Contact critNode) {
        Contact x = critNode.left;
        Contact y = critNode.right;

        x.right = critNode;
        critNode.left = y;

        critNode.height = (height(critNode.left) > height(critNode.right) ? height(critNode.left) : height(critNode.right)) + 1;

        x.height = (height(x.left) > height(x.right) ? height(x.left) : height(x.right)) + 1;

        return x;        
    }

    private Contact leftRotate (Contact critNode) {
        Contact y = critNode.right;
        Contact x =  y.left;

        y.left = critNode;
        critNode.right = x;

        critNode.height = (height(critNode.left) > height(critNode.right) ? height(critNode.left) : height(critNode.right)) + 1;

        y.height = (height(y.left) > height(y.right) ? height(y.left) : height(y.right)) + 1;

        return y;
    }

    private int getBalance (Contact curr) {
        if(curr == null) {
            return 0;
        }
        return height(curr.left) - height(curr.right);
    }

    private Contact addContactUtil (Contact curr, Contact newContact) {
        if(curr == null) {
            return newContact;
        } 
        if (curr.compareTo(newContact) > 0) {
            curr.left = addContactUtil(curr.left, newContact);
        } else if (curr.compareTo(newContact) < 0) {
            curr.left = addContactUtil(curr.right, newContact);
        } else {
            return curr;
        }

        curr.height = (height(curr.left) > height(curr.right) ? height(curr.left) : height(curr.right)) + 1;

        int bf = getBalance(curr);

        if(bf > 1 && curr.left.compareTo(newContact) > 0) {
            return rightRotate(curr);
        }

        if(bf < -1 && curr.right.compareTo(newContact) < 0) {
            return leftRotate(curr);
        }

        if(bf > 1 && curr.left.compareTo(newContact) < 0) {
            curr.left = leftRotate(curr.left);
            return rightRotate(curr);
        }

        if(bf < -1 && curr.right.compareTo(newContact) > 0) {
            curr.right = rightRotate(curr.right);
            return leftRotate(curr);
        }

        return curr;
    }

    private Contact searchContactUtil(Contact current, String newName) {
        if(current == null) {
            return null;
        }
        if(current.compareTo(newName) == 0) {
            return current;
        }
        if(current.compareTo(newName) < 0) {
            return searchContactUtil(current.right, newName);
        } else{
            return searchContactUtil(current.left, newName);
        }
    }

    private void searchContactUtilA(Contact current, String search) {
        if(current == null) {
            return;
        }
        searchContactUtilA(current.left, search);
        if(current.compareToUtil(search)) {
            // current.display();
        }
        searchContactUtilA(current.right, search);
    }

    private void listContactUtil(Contact current) {
        if(current == null) {
            return;
        }
        listContactUtil(current.left);
        // current.display();
        listContactUtil(current.right);
    }

    private Contact getMinContact(Contact current) {
        Contact ptr = current;

        while(ptr.left != null) {
            ptr = ptr.left;
        }
        return ptr;
    }

    private Contact deleteContactUtil(Contact curr, Contact del) {
        if(curr.compareTo(del) > 0) {
            curr.left = deleteContactUtil(curr.left, del);
        } else if(curr.compareTo(del) < 0) {
            curr.right = deleteContactUtil(curr.right, del);
        } else {
            if(curr.left == null || curr.right == null) {
                Contact temp = null;
                if(temp == curr.left) {
                    temp = curr.right;
                } else {
                    temp = curr.left;
                }
                if(temp == null) {
                    temp = curr;
                    curr = null;
                } else {
                    curr = temp;
                }
            } else {
                Contact temp = getMinContact(curr.right);

                curr.setData(temp);

                curr.right = deleteContactUtil(curr.right, temp);
            }
        }

        if(curr == null) {
            return curr;
        }

        curr.height = (height(curr.left) > height(curr.right) ? height(curr.left) : height(curr.right)) + 1;

        int bf = getBalance(curr);

        if(bf > 1 && getBalance(curr.left) >= 0) {
            return rightRotate(curr);
        }

        if(bf > 1 && getBalance(curr.left) < 0) {
            curr.left = leftRotate(curr.left);
            return rightRotate(curr);
        }

        if(bf < -1 && getBalance(curr.right) <= 0) {
            return leftRotate(curr);
        }

        if(bf < -1 && getBalance(curr.right) > 0) {
            curr.right = rightRotate(curr.right);
            return leftRotate(curr);
        }

        return curr;
    }

    // private void editContactUtil (Contact )


}