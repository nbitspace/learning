#re
#regex
#regular expression
import re

print("Regex.py name:", __name__)

def checkRegex(pattern, line):
    result = re.search(pattern, line)
    print("Match:", result)
    if result != None:
        print("Match span:", result.span())
        print("Match string:", result.string)
        print("Match group:", result.group())


if __name__=="__main__":
    line1 = "It is raining here. ravi is here 10"
    pattern = "^It.*here$"#starts with It and ends with here
    checkRegex(pattern, line1)
    
    pattern = "\AHi"
    checkRegex(pattern, line1)
    
    patterns = [
        "\AIt",
        r"\bra",
        r"ing\b", #r denotes raw string
        
        ]
    for pat in patterns:
        checkRegex(pat, line1)
        
    #findall() finds the patterns in the string and return the matched items
    res = re.findall("[\w]", line1)
    print("Res:", res)
    
    res = re.findall("is", line1)
    print("Res:", res)
    
    res = re.findall("rama", line1)
    print("Res:", res)
    
    #re.split() splits the string
    res = re.split("\s", line1)
    print("Res:", res)
    
    res = re.split("is", line1)
    print("Res:", res)
    
    res = re.split("\.", line1)
    print("Res:", res)
    
    res = re.split("\s", line1, 4)#4 times split happens
    print("Res:", res)
    
    #re.sub() substitutes the required ones in the string
    res = re.sub("\s", "<space>", line1)
    print("Res:", res)
    
    res = re.sub("\s", "\\\"", line1, 3)
    print("Res:", res)




