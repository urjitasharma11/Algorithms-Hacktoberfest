fun counting_sort(list: MutableList<Int>) {
    // Create temp array to count the # occurrences of each value in the list
    // - The index of the countingArray maps to values of items in the list
    // - countingArray[index] maps to # occurrences of that value
    val countingArray = IntArray(if (list.max() == null) 0 else list.max()!! + 1)
    for (item in list) countingArray[item]++

    // Regenerate the list using the countingArray
    var cursor = 0
    for (index in 0 until countingArray.size) {
        val value = index
        val numberOfOccurrences = countingArray[index]
        if (numberOfOccurrences > 0)
            repeat(numberOfOccurrences) {list[cursor++] = value}
    }
}
