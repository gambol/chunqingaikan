package net.slidingmenu.tools.b.b.d; class i { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/d/i;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v6, 0x100
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/io/UnsupportedEncodingException;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Null);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(PosShort);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :goto_2
a=0;//     const/16 v2, 0x100
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(PosShort);
a=0;//     new-array v4, v2, [I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     const/16 v2, 0x100
a=0;// 
a=0;//     new-array v5, v2, [B
a=0;// 
a=0;//     #v5=(Reference,[B);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v6, :cond_2
a=0;// 
a=0;//     aput v2, v4, v2
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_2
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v2=(Short);v3=(Conflicted);
a=0;//     if-ge v2, v6, :cond_3
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     rem-int v3, v2, v3
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v5, v2
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-short v2, v2
a=0;// 
a=0;//     #v2=(Short);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_5
a=0;//     #v2=(Integer);v3=(Integer);v6=(Integer);v7=(Conflicted);
a=0;//     const/16 v6, 0xff
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     if-ge v2, v6, :cond_4
a=0;// 
a=0;//     aget v6, v4, v2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v3, v6
a=0;// 
a=0;//     aget-byte v6, v5, v2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     add-int/2addr v3, v6
a=0;// 
a=0;//     rem-int/lit16 v3, v3, 0x100
a=0;// 
a=0;//     aget v6, v4, v2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v7, v4, v3
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     aput v7, v4, v2
a=0;// 
a=0;//     aput v6, v4, v3
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v6=(PosShort);v7=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     array-length v2, v5
a=0;// 
a=0;//     new-array v6, v2, [C
a=0;// 
a=0;//     #v6=(Reference,[C);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move v3, v0
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Short);v2=(Integer);v8=(Conflicted);
a=0;//     array-length v7, v5
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v0, v7, :cond_5
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     rem-int/lit16 v2, v2, 0x100
a=0;// 
a=0;//     aget v7, v4, v2
a=0;// 
a=0;//     add-int/2addr v3, v7
a=0;// 
a=0;//     rem-int/lit16 v3, v3, 0x100
a=0;// 
a=0;//     aget v7, v4, v2
a=0;// 
a=0;//     aget v8, v4, v3
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     aput v8, v4, v2
a=0;// 
a=0;//     aput v7, v4, v3
a=0;// 
a=0;//     aget v7, v4, v2
a=0;// 
a=0;//     aget v8, v4, v3
a=0;// 
a=0;//     rem-int/lit16 v8, v8, 0x100
a=0;// 
a=0;//     add-int/2addr v7, v8
a=0;// 
a=0;//     rem-int/lit16 v7, v7, 0x100
a=0;// 
a=0;//     aget v7, v4, v7
a=0;// 
a=0;//     int-to-char v7, v7
a=0;// 
a=0;//     #v7=(Char);
a=0;//     aget-char v8, v5, v0
a=0;// 
a=0;//     #v8=(Char);
a=0;//     xor-int/2addr v7, v8
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-char v7, v7
a=0;// 
a=0;//     #v7=(Char);
a=0;//     aput-char v7, v6, v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-short v0, v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_5
a=0;//     #v7=(Integer);v8=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v6}, Ljava/lang/String;-><init>([C)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/h/b;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(PosShort);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Integer);v3=(Integer);v4=(Reference,[I);v5=(Reference,[C);v6=(Reference,[C);v7=(Integer);v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
