public class CommonSubstring {
    public void commonSubstring(String[] a,String[] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                char [] strlista = a[i].toCharArray();
                char [] strlistb = b[i].toCharArray();
                for (int m=0;m<strlista.length;m++){
                    for (int n=0;n<strlistb.length;n++ )
                    if(strlista[m]==strlistb[n]){
                        System.out.println("YES");
                        return;
                    }
                }
                System.out.println("NO");
            }


            }
        }

    }
}
