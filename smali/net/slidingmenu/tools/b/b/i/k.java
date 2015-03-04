package net.slidingmenu.tools.b.b.i; class k { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/i/k;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/i/k;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)I
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v1, 0x66
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->g(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/i/k;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/net/NetworkInfo;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(PosByte);v2=(Reference,Landroid/net/NetworkInfo;);v3=(Boolean);
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     :try_start_1
a=0;//     invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtype()I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Byte);v2=(Reference,Landroid/net/NetworkInfo;);
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Byte);v2=(Integer);
a=0;//     const/16 v0, 0x65
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Byte);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Byte);
a=0;//     const/16 v0, 0x67
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Byte);v2=(Reference,Landroid/net/NetworkInfo;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Byte);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// 
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_4
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_4
a=0;//         :pswitch_4
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_4
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     const/16 v2, 0x19
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/i/k;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/NetworkInfo;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     :try_start_1
a=0;//     #v1=(Integer);
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_1
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-le v1, v2, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v2, 0x19
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     const-string v0, ""
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private static d(Landroid/content/Context;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(One);v1=(Boolean);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/i/k;->e(Landroid/content/Context;)Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/NetworkInfo;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static e(Landroid/content/Context;)Landroid/net/NetworkInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "connectivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
