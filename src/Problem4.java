public XSSFSheet cloneSheet(int sheetIndex) {
    validateSheetIndex(sheetIndex);
    XSSFSheet originalSheet = getSheetAt(sheetIndex);
    String newSheetName = generateUniqueSheetName(originalSheet.getSheetName());
    XSSFSheet clonedSheet = createSheet(newSheetName);
    cloneSheetContent(originalSheet, clonedSheet);
    return clonedSheet;
}

private void validateSheetIndex(int index) {
    if (index < 0 || index >= getNumberOfSheets()) {
        throw new IllegalArgumentException("Invalid sheet index: " + index);
    }
}

private String generateUniqueSheetName(String baseName) {
    String newName = baseName + " (2)";
    int counter = 2;
    while (getSheet(newName) != null) {
        counter++;
        newName = baseName + " (" + counter + ")";
    }
    return newName;
}

private void cloneSheetContent(XSSFSheet original, XSSFSheet clone) {
    // Implement cloning of rows, cells, styles, merged regions, etc.
}

public void main() {
}
