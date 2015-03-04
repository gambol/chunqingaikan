package net.slidingmenu.tools.a.a; class a { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/a/a/a;
a=0;// .super Lnet/slidingmenu/tools/b/a/e/a/b/l;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/e/a/b/l;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/a/a/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lnet/slidingmenu/tools/b/a/e/a/b/h;Lnet/slidingmenu/tools/b/a/e/a/b/f;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3}, Lnet/slidingmenu/tools/b/a/e/a/b/l;->a(Lnet/slidingmenu/tools/b/a/e/a/b/h;Lnet/slidingmenu/tools/b/a/e/a/b/f;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected a(Lnet/slidingmenu/tools/b/a/e/a/b/h;Lnet/slidingmenu/tools/b/a/e/a/b/f;Lorg/json/JSONObject;)Lorg/json/JSONObject;
a=0;//     .locals 11
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     const-string v0, "a"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p3, v0, v2}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "b"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     invoke-static {p3, v0, v2}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Lnet/slidingmenu/tools/b/a/e/a/b/h;->h()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v0, v6}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/List;);
a=0;//     move v6, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v6=(Integer);v10=(Conflicted);
a=0;//     invoke-interface {v9}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v6, v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     iget-object v10, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, v6, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v6, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     iget-object v3, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     invoke-interface {p1}, Lnet/slidingmenu/tools/b/a/e/a/b/h;->h()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v4, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     iget v3, v0, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     invoke-interface {p1}, Lnet/slidingmenu/tools/b/a/e/a/b/h;->h()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v10=(Conflicted);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/a/a/a;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Integer);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Boolean);v7=(Reference,Ljava/lang/String;);v8=(Integer);v9=(Reference,Ljava/util/List;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v8, v6, :cond_2
a=0;// 
a=0;//     check-cast v0, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v6, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v7, 0x64
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v0, v6, v7, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Reference,Ljava/lang/String;);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/a/a/a;->a(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     new-instance v6, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v7, "a"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v5, "b"
a=0;// 
a=0;//     invoke-virtual {v6, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v4, "c"
a=0;// 
a=0;//     invoke-virtual {v6, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v3, "d"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "d"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Reference,Ljava/lang/String;);v3=(Null);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Integer);v7=(Reference,Ljava/lang/String;);v8=(Integer);v9=(Reference,Ljava/util/List;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
