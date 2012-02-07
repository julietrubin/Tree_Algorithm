class GenNode {
    private GenNode _leftchild;
    private GenNode _rightsib;
    private Object _element;

    public GenNode(Object element) {
	_element = element;
    }

    public GenNode(Object element, GenNode leftchild, GenNode rightsib) {
	_element = element;
	_leftchild = leftchild;
	_rightsib = rightsib;
    }

    GenNode leftchild() {
	return _leftchild;
    }

    GenNode rightsib() {
	return _rightsib;
    }

    Object element() {
	return _element;
    }

    void setLeftchild(GenNode leftchild) {
	_leftchild = leftchild;
    }

    void setRightsib(GenNode rightsib) {
	_rightsib = rightsib;
    }

    void setElement(GenNode element) {
	_element = element;
    }
}
