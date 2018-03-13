def starymaker(stra):
    #turns string or list or tuple into dictionary - lower time spen matching later
    dicphonay = {}
    for item in stra:
        dicphonay[item] = item
    return dicphonay


def truthfinder(stra, strb):
    #checjs if thy are the same
    if len(stra) == len(strb):
        stray_a = starymaker(stra)
        stray_b = starymaker(strb)
        x = 0
        if len(stray_a) == len(stray_b):
            while x <= len(stra):
                for item in stray_a:
                    if stray_a[item] == stray_b[item]:
                        x += 1
                        if x == len(stra):
                            return "yes this is good henny"
                    else:
                        return "these are not the arrays you're looking for"
        else:
            return "these are not the arrays you're looking for"
    else:
        return "these are not the arrays you're looking for"



a = "abbv"
b = "avbb"
c = "avbc"

print(truthfinder(a, b))
print(truthfinder(a, c))
