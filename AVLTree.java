public class AVLTree {

    /**********************************************************
     * AVL tree ADT.
     * Supported operations:
     * Insert
     * Delete
     * Find
     * Min
     * Max
     **********************************************************/

    public AVLTreeNode root;   /* Pointer to the root of the tree */
    public int noOfNodes;       /* No of nodes in the tree */

    public AVLTree() {
    }

    /*******************************************************
     * Returns the number of nodes in the tree
     *******************************************************/
    int NoOfNodes() {
        return noOfNodes;
    }

    /*******************************************************
     * Inserts the key into the AVLTree. Returns a pointer
     * to the newly inserted node
     *******************************************************/
    AVLTreeNode Insert(int key) {
        return null;
    }

    /*******************************************************
     * Deletes the key from the tree (if found). Returns
     * 0 if deletion succeeds, -1 if it fails
     *******************************************************/
    int Delete(int key) {
        return 0;
    }

    /*******************************************************
     * Searches the AVLTree for a key. Returns a pointer to the
     * node that contains the key (if found) or NULL if unsuccessful
     *******************************************************/
    AVLTreeNode Find(int key) {
        return null;
    }

    /*******************************************************
     * Returns a pointer to the node that contains the minimum key
     *******************************************************/
    AVLTreeNode Min() {
        return null;
    }

    /*******************************************************
     * Returns a pointer to the node that contains the maximum key
     *******************************************************/
    AVLTreeNode Max() {
        return null;
    }

    /*******************************************************
     * Performs an inorder traversal of the tree and prints [key, height, bf]
     * triplets in sorted order in a nicely formatted table
     *******************************************************/
    void Print() {
    }

}

