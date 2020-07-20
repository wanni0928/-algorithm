#회문

def pailndrome(string):
    if len(string) <=1:
        return True
    if string[0] == string[-1]:
        return pailndrome(string[1:-1])
    else:
        return False

print(pailndrome("level"))
print(pailndrome("avante"))