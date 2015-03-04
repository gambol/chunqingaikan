package com.tencent.mm.a; class a { void a() { int a;
a=0;// .class public final Lcom/tencent/mm/a/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static final a([B)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v2, v1, [C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     fill-array-data v2, :array_0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v1, "MD5"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-int/lit8 v1, v4, 0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-array v5, v1, [C
a=0;// 
a=0;//     #v5=(Reference,[C);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v0, v4, :cond_0
a=0;// 
a=0;//     aget-byte v6, v3, v0
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     add-int/lit8 v7, v1, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     ushr-int/lit8 v8, v6, 0x4
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     and-int/lit8 v8, v8, 0xf
a=0;// 
a=0;//     aget-char v8, v2, v8
a=0;// 
a=0;//     #v8=(Char);
a=0;//     aput-char v8, v5, v1
a=0;// 
a=0;//     add-int/lit8 v1, v7, 0x1
a=0;// 
a=0;//     and-int/lit8 v6, v6, 0xf
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget-char v6, v2, v6
a=0;// 
a=0;//     #v6=(Char);
a=0;//     aput-char v6, v5, v7
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 2
a=0;//         0x30s
a=0;//         0x31s
a=0;//         0x32s
a=0;//         0x33s
a=0;//         0x34s
a=0;//         0x35s
a=0;//         0x36s
a=0;//         0x37s
a=0;//         0x38s
a=0;//         0x39s
a=0;//         0x61s
a=0;//         0x62s
a=0;//         0x63s
a=0;//         0x64s
a=0;//         0x65s
a=0;//         0x66s
a=0;//     .end array-data
a=0;// .end method
}}
