class Solution(object):
    def isPalindrome(self, s):
        
        result = ""
        for ch in s:
            if ch.isalnum():
                result += ch.lower()
        return result == result[ : :-1]
