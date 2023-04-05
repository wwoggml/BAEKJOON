# BAEKJOON


#### 230405 BAEKJOON - 2480, 2525, 25304, 25314, 10952, 10951, 10807, 10818, 2562, 10810, 10813번

<br>

##### 10951번
``` java
while ((str=br.readLine()) != null) {
    StringTokenizer st = new StringTokenizer(str);
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    sb.append(a + b).append("\n");
}
System.out.print(sb);
```