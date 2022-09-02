
print("Start")
print("mainfile.py name:", __name__)
print("Type of __name__:", type(__name__))

def main():
    print("Inside Main")
    
main()
    
print("Mid")

if __name__=="__main__":
    print("Calling main()")
    main()
    
print("End")