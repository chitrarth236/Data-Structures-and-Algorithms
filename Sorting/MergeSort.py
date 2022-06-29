class MergeSort:
    def sort(self, arr):
        if len(arr) == 1:
            return arr

        mid = len(arr) // 2

        left = self.sort(arr[:mid])
        right = self.sort(arr[mid:])

        return self.merge(left, right)

    def merge(self, first, second):
        i = 0
        j = 0
        combined = []
        while i < len(first) and j < len(second):
            if first[i] < second[j]:
                combined.append(first[i])
                i += 1
            else:
                combined.append(second[j])
                j += 1

        while i < len(first):
            combined.append(first[i])
            i += 1
        while j < len(second):
            combined.append(second[j])
            j += 1

        return combined

s = MergeSort()
print(s.sort([5,4,2,3,1,2,2,2,2,2,2,2,2,4,5]))