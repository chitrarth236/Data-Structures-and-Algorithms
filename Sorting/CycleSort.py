class CycleSort:
    def sort(self, arr):
        i = 0
        while i < len(arr):
            if arr[i] != arr[arr[i] - 1]:
                arr[arr[i] - 1], arr[i]  =  arr[i], arr[arr[i] - 1]
            else:
                 i=i+ 1
        return arr


cs = CycleSort()
arr = [3, 5, 2, 4, 1]

print(cs.sort(arr))


