package bd.edu.seu.studentadmissionserver.exception;

public class ResourceDoesNotExistException extends Exception {
    public ResourceDoesNotExistException(String resource) {
        super(resource + " does not exist!");
    }
}
