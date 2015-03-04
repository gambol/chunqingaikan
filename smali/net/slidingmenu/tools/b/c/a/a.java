package net.slidingmenu.tools.b.c.a; class a { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/c/a/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v0, ""
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :cond_1
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Null);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v4, 0xc
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/16 v5, 0x14
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     array-length v5, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     array-length v6, v4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ge v0, v6, :cond_5
a=0;// 
a=0;//     aget-byte v7, v4, v0
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     aget-byte v8, v3, v1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     xor-int/2addr v7, v8
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     and-int/lit16 v7, v7, 0xff
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     const-string v7, "00"
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :goto_2
a=0;//     #v8=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     rem-int/2addr v1, v5
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v8=(Byte);
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     if-ne v8, v9, :cond_6
a=0;// 
a=0;//     const-string v8, "0"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     :try_start_2
a=0;//     #v0=(Integer);v1=(Integer);v3=(Reference,[B);v4=(Reference,[B);v5=(Integer);v6=(Integer);v7=(Reference,Ljava/lang/String;);v8=(Integer);v9=(One);
a=0;//     invoke-virtual {v7}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-nez v8, :cond_7
a=0;// 
a=0;//     const-string v7, "00"
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Null);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     new-instance v3, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v5, 0xc
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/16 v6, 0x14
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "UTF-8"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Integer);v2=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v1, v6, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Char);
a=0;//     add-int/lit8 v8, v1, 0x1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Char);
a=0;//     invoke-static {v7}, Lnet/slidingmenu/tools/b/b/b/a;->a(C)B
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     invoke-static {v8}, Lnet/slidingmenu/tools/b/b/b/a;->a(C)B
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     shl-int/lit8 v7, v7, 0x4
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     or-int/2addr v7, v8
a=0;// 
a=0;//     int-to-byte v7, v7
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     aget-byte v8, v4, v2
a=0;// 
a=0;//     xor-int/2addr v7, v8
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-byte v7, v7
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     invoke-virtual {v3, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     rem-int/2addr v2, v5
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     const-string v3, "UTF-8"
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
}}
