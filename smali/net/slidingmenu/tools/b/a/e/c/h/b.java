package net.slidingmenu.tools.b.a.e.c.h; class b { void a() { int a;
a=0;// .class public final Lnet/slidingmenu/tools/b/a/e/c/h/b;
a=0;// .super Lnet/slidingmenu/tools/b/a/e/a/b/l;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/e/a/b/l;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/e/c/h/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Lnet/slidingmenu/tools/b/a/e/a/b/h;Lnet/slidingmenu/tools/b/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v3, "a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {p3, v3, v4}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_12
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Reference,Ujava/lang/Object;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v0, v4, :cond_12
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "BOARD"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->BOARD:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Reference,Ljava/lang/String;);v6=(Boolean);
a=0;//     const-string v6, "BRAND"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v5=(Reference,Ljava/lang/String;);v6=(Boolean);
a=0;//     const-string v6, "DEVICE"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->DEVICE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     const-string v6, "MANUFACTURER"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     const-string v6, "MODEL"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     const-string v6, "PRODUCT"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->PRODUCT:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     const-string v6, "CPU_ABI"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_7
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     const-string v6, "DISPLAY"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_8
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->DISPLAY:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     const-string v6, "FINGERPRINT"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_9
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     const-string v6, "HOST"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_a
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->HOST:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     const-string v6, "ID"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_b
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->ID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_b
a=0;//     const-string v6, "TAGS"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_c
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->TAGS:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_c
a=0;//     const-string v6, "TYPE"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_d
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->TYPE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_d
a=0;//     const-string v6, "USER"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_e
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build;->USER:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_e
a=0;//     const-string v6, "VERSION_CODENAME"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_f
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_f
a=0;//     const-string v6, "VERSION_INCREMENTAL"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_10
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_10
a=0;//     const-string v6, "VERSION_RELEASE"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_11
a=0;// 
a=0;//     sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_11
a=0;//     const-string v6, "VERSION_SDK_INT"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_12
a=0;//     #v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/a/e/c/h/b;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v3, "d"
a=0;// 
a=0;//     invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// .end method
}}
