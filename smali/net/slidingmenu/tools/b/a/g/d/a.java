package net.slidingmenu.tools.b.a.g.d; class a { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/g/d/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(PosByte);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosByte);
a=0;//     new-instance v4, Lnet/slidingmenu/tools/b/c/c/b;
a=0;// 
a=0;//     #v4=(UninitRef,Lnet/slidingmenu/tools/b/c/c/b;);
a=0;//     invoke-direct {v4, p0}, Lnet/slidingmenu/tools/b/c/c/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Lnet/slidingmenu/tools/b/c/c/b;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     :try_start_1
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-virtual {v5, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v5, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/b/b/d/b;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_17
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/c;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(PosByte);v7=(Uninit);v8=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(PosByte);v7=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {v6}, Lnet/slidingmenu/tools/b/b/d/b;->a(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     const/16 v8, 0x200
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuffer;-><init>(I)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     const-string v5, "?s="
a=0;// 
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     const-string v5, "00000"
a=0;// 
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     invoke-virtual {v7, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     new-instance v5, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v3, 0x200
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-direct {v5, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const-string v3, "22"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;// 
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_16
a=0;// 
a=0;//     :goto_2
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_4
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->f(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_15
a=0;// 
a=0;//     :goto_3
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_6
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v4}, Lnet/slidingmenu/tools/b/c/c/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_14
a=0;// 
a=0;//     :goto_4
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_8
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_0
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-virtual {v4}, Lnet/slidingmenu/tools/b/c/c/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_13
a=0;// 
a=0;//     :goto_5
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_a
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_0
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/e;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_12
a=0;// 
a=0;//     :goto_6
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_c
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_0
a=0;// 
a=0;//     :try_start_d
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/e;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_11
a=0;// 
a=0;//     :goto_7
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_e
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_0
a=0;// 
a=0;//     :try_start_f
a=0;//     invoke-virtual {v4}, Lnet/slidingmenu/tools/b/c/c/b;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_10
a=0;// 
a=0;//     :goto_8
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_10
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_10
a=0;//     .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_0
a=0;// 
a=0;//     :try_start_11
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/e;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_11
a=0;//     .catch Ljava/lang/Throwable; {:try_start_11 .. :try_end_11} :catch_f
a=0;// 
a=0;//     :goto_9
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_12
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_12
a=0;//     .catch Ljava/lang/Throwable; {:try_start_12 .. :try_end_12} :catch_0
a=0;// 
a=0;//     :try_start_13
a=0;//     invoke-virtual {v4}, Lnet/slidingmenu/tools/b/c/c/b;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_13
a=0;//     .catch Ljava/lang/Throwable; {:try_start_13 .. :try_end_13} :catch_e
a=0;// 
a=0;//     :goto_a
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_14
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;// 
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_14
a=0;//     .catch Ljava/lang/Throwable; {:try_start_14 .. :try_end_14} :catch_0
a=0;// 
a=0;//     :try_start_15
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_15
a=0;//     .catch Ljava/lang/Throwable; {:try_start_15 .. :try_end_15} :catch_d
a=0;// 
a=0;//     :goto_b
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_16
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_16
a=0;//     .catch Ljava/lang/Throwable; {:try_start_16 .. :try_end_16} :catch_0
a=0;// 
a=0;//     :try_start_17
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_17
a=0;//     .catch Ljava/lang/Throwable; {:try_start_17 .. :try_end_17} :catch_c
a=0;// 
a=0;//     :goto_c
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_18
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_18
a=0;//     .catch Ljava/lang/Throwable; {:try_start_18 .. :try_end_18} :catch_0
a=0;// 
a=0;//     :try_start_19
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     invoke-virtual {v3}, Lnet/slidingmenu/tools/b/b/k/f;->b()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_19
a=0;//     .catch Ljava/lang/Throwable; {:try_start_19 .. :try_end_19} :catch_b
a=0;// 
a=0;//     :goto_d
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_1a
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_1a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1a .. :try_end_1a} :catch_0
a=0;// 
a=0;//     :try_start_1b
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     invoke-virtual {v3}, Lnet/slidingmenu/tools/b/b/k/f;->c()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_1b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1b .. :try_end_1b} :catch_a
a=0;// 
a=0;//     :goto_e
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_1c
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_1c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1c .. :try_end_1c} :catch_0
a=0;// 
a=0;//     :try_start_1d
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     invoke-virtual {v3}, Lnet/slidingmenu/tools/b/b/k/f;->d()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_1d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1d .. :try_end_1d} :catch_9
a=0;// 
a=0;//     :goto_f
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_1e
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_1e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1e .. :try_end_1e} :catch_0
a=0;// 
a=0;//     :try_start_1f
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/n;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     const-string v3, "1"
a=0;// 
a=0;//     :goto_10
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_1f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1f .. :try_end_1f} :catch_8
a=0;// 
a=0;//     :goto_11
a=0;//     const/16 v3, 0x26
a=0;// 
a=0;//     :try_start_20
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_20
a=0;//     .catch Ljava/lang/Throwable; {:try_start_20 .. :try_end_20} :catch_0
a=0;// 
a=0;//     :try_start_21
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/l;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     :goto_12
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "wifi"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     :cond_5
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_21
a=0;//     .catch Ljava/lang/Throwable; {:try_start_21 .. :try_end_21} :catch_7
a=0;// 
a=0;//     :goto_13
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const/16 v0, 0x26
a=0;// 
a=0;//     :try_start_22
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_22
a=0;//     .catch Ljava/lang/Throwable; {:try_start_22 .. :try_end_22} :catch_0
a=0;// 
a=0;//     :try_start_23
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     invoke-static {v0, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_23
a=0;//     .catch Ljava/lang/Throwable; {:try_start_23 .. :try_end_23} :catch_6
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_14
a=0;//     const/16 v0, 0x26
a=0;// 
a=0;//     :try_start_24
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_24
a=0;//     .catch Ljava/lang/Throwable; {:try_start_24 .. :try_end_24} :catch_0
a=0;// 
a=0;//     :try_start_25
a=0;//     sget-object v0, Landroid/os/Build;->BOARD:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_25
a=0;//     .catch Ljava/lang/Throwable; {:try_start_25 .. :try_end_25} :catch_5
a=0;// 
a=0;//     :goto_15
a=0;//     const/16 v0, 0x26
a=0;// 
a=0;//     :try_start_26
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_26
a=0;//     .catch Ljava/lang/Throwable; {:try_start_26 .. :try_end_26} :catch_0
a=0;// 
a=0;//     :try_start_27
a=0;//     sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_27
a=0;//     .catch Ljava/lang/Throwable; {:try_start_27 .. :try_end_27} :catch_4
a=0;// 
a=0;//     :goto_16
a=0;//     const/16 v0, 0x26
a=0;// 
a=0;//     :try_start_28
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_28
a=0;//     .catch Ljava/lang/Throwable; {:try_start_28 .. :try_end_28} :catch_0
a=0;// 
a=0;//     :try_start_29
a=0;//     sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_29
a=0;//     .catch Ljava/lang/Throwable; {:try_start_29 .. :try_end_29} :catch_3
a=0;// 
a=0;//     :goto_17
a=0;//     const/16 v0, 0x26
a=0;// 
a=0;//     :try_start_2a
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_2a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2a .. :try_end_2a} :catch_0
a=0;// 
a=0;//     :try_start_2b
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v8, 0x3e8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     div-long/2addr v2, v8
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v5}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_2b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2b .. :try_end_2b} :catch_2
a=0;// 
a=0;//     :goto_18
a=0;//     :try_start_2c
a=0;//     #v2=(Conflicted);v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ef45N92f053P36cd"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_2c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2c .. :try_end_2c} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_2d
a=0;//     invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const v3, 0xc5939
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v0, v3}, Lnet/slidingmenu/tools/b/b/d/b;->a([BLjava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_2d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2d .. :try_end_2d} :catch_1
a=0;// 
a=0;//     :goto_19
a=0;//     :try_start_2e
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;//     :try_end_2e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2e .. :try_end_2e} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     :try_start_2f
a=0;//     #v0=(PosByte);v2=(Null);v3=(Boolean);v8=(PosShort);v9=(Uninit);
a=0;//     const-string v3, "0"
a=0;//     :try_end_2f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2f .. :try_end_2f} :catch_8
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/Object;);v4=(Reference,Lnet/slidingmenu/tools/b/c/c/b;);v5=(Reference,Ljava/io/ByteArrayOutputStream;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/StringBuffer;);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_19
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_18
a=0;// 
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v8=(PosShort);v9=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_17
a=0;// 
a=0;//     :catch_4
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_16
a=0;// 
a=0;//     :catch_5
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_15
a=0;// 
a=0;//     :catch_6
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_14
a=0;// 
a=0;//     :catch_7
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_13
a=0;// 
a=0;//     :catch_8
a=0;//     #v0=(PosByte);v2=(Null);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_11
a=0;// 
a=0;//     :catch_9
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_f
a=0;// 
a=0;//     :catch_a
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_e
a=0;// 
a=0;//     :catch_b
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     :catch_c
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     :catch_d
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     :catch_e
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     :catch_f
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :catch_10
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :catch_11
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :catch_12
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catch_13
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catch_14
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :catch_15
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_16
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_17
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     #v3=(Boolean);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/StringBuffer;);v8=(PosShort);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_12
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/b/i/c;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/b/i/c;);
a=0;//     invoke-direct {v1}, Lnet/slidingmenu/tools/b/b/i/c;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/i/c;);
a=0;//     invoke-virtual {v1, p1}, Lnet/slidingmenu/tools/b/b/i/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v2, Lnet/slidingmenu/tools/b/c/d/b;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/slidingmenu/tools/b/c/d/b;);
a=0;//     invoke-direct {v2, p0, v1}, Lnet/slidingmenu/tools/b/c/d/b;-><init>(Landroid/content/Context;Lnet/slidingmenu/tools/b/b/i/c;)V
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/c/d/b;);
a=0;//     invoke-virtual {v2}, Lnet/slidingmenu/tools/b/c/d/b;->b()V
a=0;// 
a=0;//     invoke-virtual {v2}, Lnet/slidingmenu/tools/b/c/d/b;->e()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, p2, p3, v0}, Lnet/slidingmenu/tools/b/a/g/d/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p4}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     const-string p4, "00000"
a=0;// 
a=0;//     :cond_2
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x200
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v5, 0x3e8
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     div-long/2addr v3, v5
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/d/b;->a(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/c/c/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/c/c/b;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/b/c/c/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/c/c/b;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "?s="
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v8, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v9, 0x200
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     invoke-direct {v8, v9}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const-string v9, "33"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;// 
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/c/c/b;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_22
a=0;// 
a=0;//     :goto_1
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_2
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/c/c/b;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_21
a=0;// 
a=0;//     :goto_2
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_4
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/c/c/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_20
a=0;// 
a=0;//     :goto_3
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_6
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/c/c/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_1f
a=0;// 
a=0;//     :goto_4
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_8
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_0
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_1e
a=0;// 
a=0;//     :goto_5
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_a
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_0
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->f(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_1d
a=0;// 
a=0;//     :goto_6
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_c
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_0
a=0;// 
a=0;//     :try_start_d
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/e;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_1c
a=0;// 
a=0;//     :goto_7
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_e
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_0
a=0;// 
a=0;//     :try_start_f
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/e;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_1b
a=0;// 
a=0;//     :goto_8
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_10
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_10
a=0;//     .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_0
a=0;// 
a=0;//     :try_start_11
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/b/h/e;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_11
a=0;//     .catch Ljava/lang/Throwable; {:try_start_11 .. :try_end_11} :catch_1a
a=0;// 
a=0;//     :goto_9
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_12
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_12
a=0;//     .catch Ljava/lang/Throwable; {:try_start_12 .. :try_end_12} :catch_0
a=0;// 
a=0;//     :try_start_13
a=0;//     sget-object v9, Landroid/os/Build;->BOARD:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_13
a=0;//     .catch Ljava/lang/Throwable; {:try_start_13 .. :try_end_13} :catch_19
a=0;// 
a=0;//     :goto_a
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_14
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_14
a=0;//     .catch Ljava/lang/Throwable; {:try_start_14 .. :try_end_14} :catch_0
a=0;// 
a=0;//     :try_start_15
a=0;//     sget-object v9, Landroid/os/Build;->BRAND:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_15
a=0;//     .catch Ljava/lang/Throwable; {:try_start_15 .. :try_end_15} :catch_18
a=0;// 
a=0;//     :goto_b
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_16
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_16
a=0;//     .catch Ljava/lang/Throwable; {:try_start_16 .. :try_end_16} :catch_0
a=0;// 
a=0;//     :try_start_17
a=0;//     sget-object v9, Landroid/os/Build;->DEVICE:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_17
a=0;//     .catch Ljava/lang/Throwable; {:try_start_17 .. :try_end_17} :catch_17
a=0;// 
a=0;//     :goto_c
a=0;//     const/16 v9, 0x26
a=0;// 
a=0;//     :try_start_18
a=0;//     #v9=(PosByte);
a=0;//     invoke-virtual {v8, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_18
a=0;//     .catch Ljava/lang/Throwable; {:try_start_18 .. :try_end_18} :catch_0
a=0;// 
a=0;//     :try_start_19
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/c/c/b;->e()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     :goto_d
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_19
a=0;//     .catch Ljava/lang/Throwable; {:try_start_19 .. :try_end_19} :catch_16
a=0;// 
a=0;//     :goto_e
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_1a
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_1a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1a .. :try_end_1a} :catch_0
a=0;// 
a=0;//     :try_start_1b
a=0;//     invoke-virtual {v6}, Lnet/slidingmenu/tools/b/b/k/f;->g()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_1b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1b .. :try_end_1b} :catch_15
a=0;// 
a=0;//     :goto_f
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_1c
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_1c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1c .. :try_end_1c} :catch_0
a=0;// 
a=0;//     :try_start_1d
a=0;//     invoke-virtual {v6}, Lnet/slidingmenu/tools/b/b/k/f;->h()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_1d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1d .. :try_end_1d} :catch_14
a=0;// 
a=0;//     :goto_10
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_1e
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_1e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1e .. :try_end_1e} :catch_0
a=0;// 
a=0;//     :try_start_1f
a=0;//     invoke-virtual {v6}, Lnet/slidingmenu/tools/b/b/k/f;->e()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_1f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1f .. :try_end_1f} :catch_13
a=0;// 
a=0;//     :goto_11
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_20
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_20
a=0;//     .catch Ljava/lang/Throwable; {:try_start_20 .. :try_end_20} :catch_0
a=0;// 
a=0;//     :try_start_21
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_21
a=0;//     .catch Ljava/lang/Throwable; {:try_start_21 .. :try_end_21} :catch_12
a=0;// 
a=0;//     :goto_12
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_22
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_22
a=0;//     .catch Ljava/lang/Throwable; {:try_start_22 .. :try_end_22} :catch_0
a=0;// 
a=0;//     :try_start_23
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_23
a=0;//     .catch Ljava/lang/Throwable; {:try_start_23 .. :try_end_23} :catch_11
a=0;// 
a=0;//     :goto_13
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_24
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_24
a=0;//     .catch Ljava/lang/Throwable; {:try_start_24 .. :try_end_24} :catch_0
a=0;// 
a=0;//     :try_start_25
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->e(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_25
a=0;//     .catch Ljava/lang/Throwable; {:try_start_25 .. :try_end_25} :catch_10
a=0;// 
a=0;//     :goto_14
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_26
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_26
a=0;//     .catch Ljava/lang/Throwable; {:try_start_26 .. :try_end_26} :catch_0
a=0;// 
a=0;//     :try_start_27
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->f(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_27
a=0;//     .catch Ljava/lang/Throwable; {:try_start_27 .. :try_end_27} :catch_f
a=0;// 
a=0;//     :goto_15
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_28
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_28
a=0;//     .catch Ljava/lang/Throwable; {:try_start_28 .. :try_end_28} :catch_0
a=0;// 
a=0;//     :try_start_29
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->g(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_29
a=0;//     .catch Ljava/lang/Throwable; {:try_start_29 .. :try_end_29} :catch_e
a=0;// 
a=0;//     :goto_16
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_2a
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_2a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2a .. :try_end_2a} :catch_0
a=0;// 
a=0;//     :try_start_2b
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_2b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2b .. :try_end_2b} :catch_d
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_17
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_2c
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_2c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2c .. :try_end_2c} :catch_0
a=0;// 
a=0;//     :try_start_2d
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_2d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2d .. :try_end_2d} :catch_c
a=0;// 
a=0;//     :goto_18
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_2e
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_2e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2e .. :try_end_2e} :catch_0
a=0;// 
a=0;//     :try_start_2f
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->h(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_2f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2f .. :try_end_2f} :catch_b
a=0;// 
a=0;//     :goto_19
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_30
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_30
a=0;//     .catch Ljava/lang/Throwable; {:try_start_30 .. :try_end_30} :catch_0
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :try_start_31
a=0;//     invoke-virtual {v7}, Landroid/location/Location;->getLatitude()D
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(DoubleLo);v10=(DoubleHi);
a=0;//     invoke-static {v9, v10}, Ljava/lang/Double;->toString(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_31
a=0;//     .catch Ljava/lang/Throwable; {:try_start_31 .. :try_end_31} :catch_a
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_1a
a=0;//     #v1=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_32
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_32
a=0;//     .catch Ljava/lang/Throwable; {:try_start_32 .. :try_end_32} :catch_0
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     :try_start_33
a=0;//     invoke-virtual {v7}, Landroid/location/Location;->getLongitude()D
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(DoubleLo);v7=(DoubleHi);
a=0;//     invoke-static {v6, v7}, Ljava/lang/Double;->toString(D)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_33
a=0;//     .catch Ljava/lang/Throwable; {:try_start_33 .. :try_end_33} :catch_9
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_1b
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_34
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_34
a=0;//     .catch Ljava/lang/Throwable; {:try_start_34 .. :try_end_34} :catch_0
a=0;// 
a=0;//     :try_start_35
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/f/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_35
a=0;//     .catch Ljava/lang/Throwable; {:try_start_35 .. :try_end_35} :catch_8
a=0;// 
a=0;//     :goto_1c
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_36
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_36
a=0;//     .catch Ljava/lang/Throwable; {:try_start_36 .. :try_end_36} :catch_0
a=0;// 
a=0;//     :try_start_37
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/n;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     :goto_1d
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_37
a=0;//     .catch Ljava/lang/Throwable; {:try_start_37 .. :try_end_37} :catch_7
a=0;// 
a=0;//     :goto_1e
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_38
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_38
a=0;//     .catch Ljava/lang/Throwable; {:try_start_38 .. :try_end_38} :catch_0
a=0;// 
a=0;//     :try_start_39
a=0;//     invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_39
a=0;//     .catch Ljava/lang/Throwable; {:try_start_39 .. :try_end_39} :catch_6
a=0;// 
a=0;//     :goto_1f
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_3a
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_3a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3a .. :try_end_3a} :catch_0
a=0;// 
a=0;//     :try_start_3b
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_3b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3b .. :try_end_3b} :catch_5
a=0;// 
a=0;//     :goto_20
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_3c
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_3c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3c .. :try_end_3c} :catch_0
a=0;// 
a=0;//     :try_start_3d
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_3d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3d .. :try_end_3d} :catch_4
a=0;// 
a=0;//     :goto_21
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_3e
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_3e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3e .. :try_end_3e} :catch_0
a=0;// 
a=0;//     :try_start_3f
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/c/c/a;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     :goto_22
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_3f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3f .. :try_end_3f} :catch_3
a=0;// 
a=0;//     :goto_23
a=0;//     const/16 v1, 0x26
a=0;// 
a=0;//     :try_start_40
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v8, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_40
a=0;//     .catch Ljava/lang/Throwable; {:try_start_40 .. :try_end_40} :catch_0
a=0;// 
a=0;//     :try_start_41
a=0;//     invoke-static {p2}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     const-string p2, ""
a=0;// 
a=0;//     :cond_6
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/d/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v8}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_41
a=0;//     .catch Ljava/lang/Throwable; {:try_start_41 .. :try_end_41} :catch_2
a=0;// 
a=0;//     :goto_24
a=0;//     :try_start_42
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "ef45N92f053P36cd"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_42
a=0;//     .catch Ljava/lang/Throwable; {:try_start_42 .. :try_end_42} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_43
a=0;//     invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0xc5939
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v1, v4}, Lnet/slidingmenu/tools/b/b/d/b;->a([BLjava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_43
a=0;//     .catch Ljava/lang/Throwable; {:try_start_43 .. :try_end_43} :catch_1
a=0;// 
a=0;//     :goto_25
a=0;//     :try_start_44
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_44
a=0;//     .catch Ljava/lang/Throwable; {:try_start_44 .. :try_end_44} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     :try_start_45
a=0;//     #v0=(Null);v1=(Boolean);v3=(LongLo);v4=(LongHi);v6=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);v7=(Null);v9=(PosByte);v10=(Uninit);
a=0;//     const-string v1, "0"
a=0;//     :try_end_45
a=0;//     .catch Ljava/lang/Throwable; {:try_start_45 .. :try_end_45} :catch_16
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     :cond_8
a=0;//     :try_start_46
a=0;//     #v1=(Boolean);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const-string v1, "0"
a=0;//     :try_end_46
a=0;//     .catch Ljava/lang/Throwable; {:try_start_46 .. :try_end_46} :catch_7
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1d
a=0;// 
a=0;//     :cond_9
a=0;//     :try_start_47
a=0;//     #v1=(Boolean);
a=0;//     const-string v1, "0"
a=0;//     :try_end_47
a=0;//     .catch Ljava/lang/Throwable; {:try_start_47 .. :try_end_47} :catch_3
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_22
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);v3=(Reference,Ljava/lang/Object;);v5=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_25
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(LongHi);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_24
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);v3=(LongLo);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_23
a=0;// 
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_21
a=0;// 
a=0;//     :catch_5
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_20
a=0;// 
a=0;//     :catch_6
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_1f
a=0;// 
a=0;//     :catch_7
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_1e
a=0;// 
a=0;//     :catch_8
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_1c
a=0;// 
a=0;//     :catch_9
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_1b
a=0;// 
a=0;//     :catch_a
a=0;//     #v1=(Conflicted);v6=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);v7=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_1a
a=0;// 
a=0;//     :catch_b
a=0;//     #v1=(Conflicted);v9=(PosByte);v10=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_19
a=0;// 
a=0;//     :catch_c
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_18
a=0;// 
a=0;//     :catch_d
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_17
a=0;// 
a=0;//     :catch_e
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_16
a=0;// 
a=0;//     :catch_f
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_15
a=0;// 
a=0;//     :catch_10
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_14
a=0;// 
a=0;//     :catch_11
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_13
a=0;// 
a=0;//     :catch_12
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_12
a=0;// 
a=0;//     :catch_13
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_11
a=0;// 
a=0;//     :catch_14
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :catch_15
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_f
a=0;// 
a=0;//     :catch_16
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_e
a=0;// 
a=0;//     :catch_17
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     :catch_18
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     :catch_19
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     :catch_1a
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :catch_1b
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :catch_1c
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     :catch_1d
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catch_1e
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :catch_1f
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :catch_20
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_21
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_22
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/e/g/b;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->e()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v2, 0x200
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long/2addr v2, v4
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "?s="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v4, "00000"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v4, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v5, 0x200
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-direct {v4, v5}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const-string v5, "2"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;// 
a=0;//     const/16 v5, 0x26
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3
a=0;// 
a=0;//     :goto_1
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :try_start_3
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/d/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_4
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "ef45N92f053P36cd"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0xc5939
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v2, v4}, Lnet/slidingmenu/tools/b/b/d/b;->a([BLjava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/16 v2, 0x2c
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_6
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v3=(Reference,Ljava/lang/Object;);v5=(PosByte);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_3
a=0;//     #v2=(Conflicted);v3=(LongHi);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/e/g/b;I)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->e()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v2, 0x200
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long/2addr v2, v4
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "?s="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v4, "00000"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v4, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v5, 0x200
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-direct {v4, v5}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const-string v5, "3"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;// 
a=0;//     const/16 v5, 0x26
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_4
a=0;// 
a=0;//     :goto_1
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_3
a=0;// 
a=0;//     :goto_2
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     :try_start_4
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     :try_start_5
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/d/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     :goto_3
a=0;//     :try_start_6
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "ef45N92f053P36cd"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0xc5939
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v2, v4}, Lnet/slidingmenu/tools/b/b/d/b;->a([BLjava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/16 v2, 0x2c
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_1
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_8
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v3=(Reference,Ljava/lang/Object;);v5=(PosByte);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_3
a=0;//     #v2=(Conflicted);v3=(LongHi);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_4
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/e/g/b;IJ)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->e()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v2, 0x200
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x3e8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     div-long/2addr v2, v4
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "?s="
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v4, "00000"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v4, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v5, 0x200
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-direct {v4, v5}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const-string v5, "3"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;// 
a=0;//     const/16 v5, 0x26
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_8
a=0;// 
a=0;//     :goto_1
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     :try_start_2
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_7
a=0;// 
a=0;//     :goto_2
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     :try_start_4
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     :try_start_5
a=0;//     invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_6
a=0;// 
a=0;//     :goto_3
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     :try_start_6
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;// 
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_0
a=0;// 
a=0;//     :try_start_7
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->g(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_5
a=0;// 
a=0;//     :goto_4
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     :try_start_8
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_0
a=0;// 
a=0;//     :try_start_9
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->j(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_4
a=0;// 
a=0;//     :goto_5
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     :try_start_a
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_0
a=0;// 
a=0;//     :try_start_b
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->k(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_3
a=0;// 
a=0;//     :goto_6
a=0;//     const/16 v2, 0x26
a=0;// 
a=0;//     :try_start_c
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v4, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Throwable; {:try_start_c .. :try_end_c} :catch_0
a=0;// 
a=0;//     :try_start_d
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v4}, Lnet/slidingmenu/tools/b/a/g/d/b;->a(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Throwable; {:try_start_d .. :try_end_d} :catch_2
a=0;// 
a=0;//     :goto_7
a=0;//     :try_start_e
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "ef45N92f053P36cd"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Throwable; {:try_start_e .. :try_end_e} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_f
a=0;//     invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const v4, 0xc5939
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v2, v4}, Lnet/slidingmenu/tools/b/b/d/b;->a([BLjava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const/16 v2, 0x2c
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {p1}, Lnet/slidingmenu/tools/b/a/e/g/b;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_f
a=0;//     .catch Ljava/lang/Throwable; {:try_start_f .. :try_end_f} :catch_1
a=0;// 
a=0;//     :goto_8
a=0;//     :try_start_10
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_10
a=0;//     .catch Ljava/lang/Throwable; {:try_start_10 .. :try_end_10} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v3=(Reference,Ljava/lang/Object;);v5=(PosByte);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_8
a=0;// 
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);v3=(LongHi);v4=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_3
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_6
a=0;// 
a=0;//     :catch_4
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_5
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_6
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :catch_7
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_8
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v1, 0x40
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "&first_ei="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "&first_si="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->e(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "&ntype="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->j(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "&advid="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->k(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "&bssid="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/h/e;->g(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
