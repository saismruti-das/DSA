class Solution(object):
    def longestCommonPrefix(self, words):
        """
        :type strs: List[str]
        :rtype: str
        """
        words_length=len(words)     #3
        check_word=words[0]         #flower
        i=0
        temp_prefix=prefix=""
        while (i<len(check_word)):             #0
            temp_prefix+=check_word[i]      #flo
            for word in words:              #flower
                if not word.startswith(temp_prefix):
                    return prefix
            prefix=temp_prefix             #fl
            i+=1                        #i=2
        
        return prefix
