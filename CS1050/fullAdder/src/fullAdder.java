import java.util.Scanner;

public class fullAdder 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        // Get first binary number
        System.out.print("Enter first 8-bit binary number: ");
        String binary1 = scanner.nextLine();
        
        // Get second binary number
        System.out.print("Enter second 8-bit binary number: ");
        String binary2 = scanner.nextLine();
        
        // Check length of inputs
        if (binary1.length() != 8) 
        {
            System.out.println("Error: First number must be 8 bits!");
            scanner.close();
            return;
        } 
        else if (binary2.length() != 8) 
        {
            System.out.println("Error: Second number must be 8 bits!");
            scanner.close();
            return;
        } 
        else 
        {
            // Validate first number contains only 0s and 1s
            if 
            (!checkBinaryDigits(binary1)) {
                System.out.println("Error: First number can only contain 0s and 1s!");
                scanner.close();
                return;
            } 
            else if (!checkBinaryDigits(binary2)) 
            {
                System.out.println("Error: Second number can only contain 0s and 1s!");
                scanner.close();
                return;
            } 
            else 
            {
                // Perform addition
                String result = addBinaryNumbers(binary1, binary2);
                
                // Display results
                System.out.println("\nFirst number:  " + binary1);
                System.out.println("Second number: " + binary2);
                System.out.println("Result:       " + result);
            }
        }
        scanner.close();
    }
    
    public static boolean checkBinaryDigits(String binary) 
    {
        if (binary.charAt(0) != '0' && binary.charAt(0) != '1') return false;
        else if (binary.charAt(1) != '0' && binary.charAt(1) != '1') return false;
        else if (binary.charAt(2) != '0' && binary.charAt(2) != '1') return false;
        else if (binary.charAt(3) != '0' && binary.charAt(3) != '1') return false;
        else if (binary.charAt(4) != '0' && binary.charAt(4) != '1') return false;
        else if (binary.charAt(5) != '0' && binary.charAt(5) != '1') return false;
        else if (binary.charAt(6) != '0' && binary.charAt(6) != '1') return false;
        else if (binary.charAt(7) != '0' && binary.charAt(7) != '1') return false;
        else return true;
    }
    
    public static String addBinaryNumbers(String binary1, String binary2) 
    {
        char[] result = new char[9];  // 8 bits plus possible carry
        int carry = 0;
        
        // Add bit 7 (rightmost)
        if (binary1.charAt(7) == '0' && binary2.charAt(7) == '0') 
        {
            result[8] = '0';
            carry = 0;
        } 
        else if (binary1.charAt(7) == '1' && binary2.charAt(7) == '0') 
        {
            result[8] = '1';
            carry = 0;
        } 
        else if (binary1.charAt(7) == '0' && binary2.charAt(7) == '1') 
        {
            result[8] = '1';
            carry = 0;
        } 
        else 
        {  // both are 1
            result[8] = '0';
            carry = 1;
        }
        
        // Add bit 6
        if (binary1.charAt(6) == '0' && binary2.charAt(6) == '0') 
        {
            result[7] = carry == 0 ? '0' : '1';
            carry = 0;
        } 
        else if ((binary1.charAt(6) == '1' && binary2.charAt(6) == '0') || 
                   (binary1.charAt(6) == '0' && binary2.charAt(6) == '1')) 
        {
            if (carry == 0) 
            {
                result[7] = '1';
                carry = 0;
            } 
            else 
            {
                result[7] = '0';
                carry = 1;
            }
        } 
        else 
        {  // both are 1
            result[7] = carry == 0 ? '0' : '1';
            carry = 1;
        }
        
        // Add bit 5
        if (binary1.charAt(5) == '0' && binary2.charAt(5) == '0') 
        {
            result[6] = carry == 0 ? '0' : '1';
            carry = 0;
        } 
        else if ((binary1.charAt(5) == '1' && binary2.charAt(5) == '0') || 
                   (binary1.charAt(5) == '0' && binary2.charAt(5) == '1')) 
        {
            if (carry == 0) 
            {
                result[6] = '1';
                carry = 0;
            } 
            else 
            {
                result[6] = '0';
                carry = 1;
            }
        } 
        else 
        {  // both are 1
            result[6] = carry == 0 ? '0' : '1';
            carry = 1;
        }
        
        // Add bit 4
        if (binary1.charAt(4) == '0' && binary2.charAt(4) == '0') 
        {
            result[5] = carry == 0 ? '0' : '1';
            carry = 0;
        } 
        else if ((binary1.charAt(4) == '1' && binary2.charAt(4) == '0') || 
                   (binary1.charAt(4) == '0' && binary2.charAt(4) == '1')) 
        {
            if (carry == 0) 
            {
                result[5] = '1';
                carry = 0;
            } 
            else 
            {
                result[5] = '0';
                carry = 1;
            }
        } 
        else 
        {  // both are 1
            result[5] = carry == 0 ? '0' : '1';
            carry = 1;
        }
        
        // Add bit 3
        if (binary1.charAt(3) == '0' && binary2.charAt(3) == '0') 
        {
            result[4] = carry == 0 ? '0' : '1';
            carry = 0;
        } 
        else if ((binary1.charAt(3) == '1' && binary2.charAt(3) == '0') || 
                   (binary1.charAt(3) == '0' && binary2.charAt(3) == '1')) 
        {
            if (carry == 0) 
            {
                result[4] = '1';
                carry = 0;
            } 
            else 
            {
                result[4] = '0';
                carry = 1;
            }
        } 
        else 
        {  // both are 1
            result[4] = carry == 0 ? '0' : '1';
            carry = 1;
        }
        
        // Add bit 2
        if (binary1.charAt(2) == '0' && binary2.charAt(2) == '0') 
        {
            result[3] = carry == 0 ? '0' : '1';
            carry = 0;
        } 
        else if ((binary1.charAt(2) == '1' && binary2.charAt(2) == '0') || 
                   (binary1.charAt(2) == '0' && binary2.charAt(2) == '1')) 
        {
            if (carry == 0) 
            {
                result[3] = '1';
                carry = 0;
            } 
            else 
            {
                result[3] = '0';
                carry = 1;
            }
        } 
        else 
        {  // both are 1
            result[3] = carry == 0 ? '0' : '1';
            carry = 1;
        }
        
        // Add bit 1
        if (binary1.charAt(1) == '0' && binary2.charAt(1) == '0') 
        {
            result[2] = carry == 0 ? '0' : '1';
            carry = 0;
        } 
        else if ((binary1.charAt(1) == '1' && binary2.charAt(1) == '0') || 
                   (binary1.charAt(1) == '0' && binary2.charAt(1) == '1')) 
        {
            if (carry == 0) 
            {
                result[2] = '1';
                carry = 0;
            } 
            else 
            {
                result[2] = '0';
                carry = 1;
            }
        } 
        else 
        {  // both are 1
            result[2] = carry == 0 ? '0' : '1';
            carry = 1;
        }
        
        // Add bit 0 (leftmost)
        if (binary1.charAt(0) == '0' && binary2.charAt(0) == '0') 
        {
            result[1] = carry == 0 ? '0' : '1';
            carry = 0;
        } 
        else if ((binary1.charAt(0) == '1' && binary2.charAt(0) == '0') || 
                   (binary1.charAt(0) == '0' && binary2.charAt(0) == '1')) 
        {
            if (carry == 0) 
            {
                result[1] = '1';
                carry = 0;
            } 
            else 
            {
                result[1] = '0';
                carry = 1;
            }
        } 
        else 
        {  // both are 1
            result[1] = carry == 0 ? '0' : '1';
            carry = 1;
        }
        
        // Handle final carry
        result[0] = carry == 1 ? '1' : '0';
        
        // Convert result to string
        if (result[0] == '1') 
        {
            return new String(result);
        } 
        else 
        {
            return new String(result).substring(1);
        }
    }
}