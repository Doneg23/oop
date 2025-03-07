public class Introduction
{
    public static void main(String[] args)
    {
        String name = "Nguyễn Hải Đăng";
        String studentId = "24022281";
        String studentClass = "INT2204 1";
        String githubUsername = "Doneg23";
        String email = "24022281@vnu.edu.vn";
        System.out.println(name + "\t" + studentId + "\t" + studentClass + "\t" + githubUsername + "\t" + email);
        for (int i = 9; i > 0; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall.");
            } else {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                System.out.println("Take one down, pass it around, no more bottles of beer on the wall.");
            }
        }
    }
}
