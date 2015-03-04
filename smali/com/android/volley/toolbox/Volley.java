package com.android.volley.toolbox; class Volley { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/Volley;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Volley.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_CACHE_DIR:Ljava/lang/String; = "volley"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/Volley;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static newRequestQueue(Landroid/content/Context;)Lcom/android/volley/RequestQueue;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;Lcom/android/volley/toolbox/HttpStack;)Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/RequestQueue;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static newRequestQueue(Landroid/content/Context;Lcom/android/volley/toolbox/HttpStack;)Lcom/android/volley/RequestQueue;
a=0;//     .locals 8
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "stack"    # Lcom/android/volley/toolbox/HttpStack;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     const-string v7, "volley"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 45
a=0;//     .local v0, "cacheDir":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     const-string v5, "volley/0"
a=0;// 
a=0;//     .line 47
a=0;//     .local v5, "userAgent":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 48
a=0;//     .local v3, "packageName":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v3, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 49
a=0;//     .local v1, "info":Landroid/content/pm/PackageInfo;
a=0;//     #v1=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "/"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget v7, v1, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 53
a=0;//     .end local v1    # "info":Landroid/content/pm/PackageInfo;
a=0;//     .end local v3    # "packageName":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v7=(Conflicted);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     sget v6, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/16 v7, 0x9
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-lt v6, v7, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     new-instance p1, Lcom/android/volley/toolbox/HurlStack;
a=0;// 
a=0;//     .end local p1    # "stack":Lcom/android/volley/toolbox/HttpStack;
a=0;//     #p1=(UninitRef,Lcom/android/volley/toolbox/HurlStack;);
a=0;//     invoke-direct {p1}, Lcom/android/volley/toolbox/HurlStack;-><init>()V
a=0;// 
a=0;//     .line 63
a=0;//     .restart local p1    # "stack":Lcom/android/volley/toolbox/HttpStack;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);p1=(Reference,Ujava/lang/Object;);
a=0;//     new-instance v2, Lcom/android/volley/toolbox/BasicNetwork;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/android/volley/toolbox/BasicNetwork;);
a=0;//     invoke-direct {v2, p1}, Lcom/android/volley/toolbox/BasicNetwork;-><init>(Lcom/android/volley/toolbox/HttpStack;)V
a=0;// 
a=0;//     .line 65
a=0;//     .local v2, "network":Lcom/android/volley/Network;
a=0;//     #v2=(Reference,Lcom/android/volley/toolbox/BasicNetwork;);
a=0;//     new-instance v4, Lcom/android/volley/RequestQueue;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/android/volley/RequestQueue;);
a=0;//     new-instance v6, Lcom/android/volley/toolbox/DiskBasedCache;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/android/volley/toolbox/DiskBasedCache;);
a=0;//     invoke-direct {v6, v0}, Lcom/android/volley/toolbox/DiskBasedCache;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/android/volley/toolbox/DiskBasedCache;);
a=0;//     invoke-direct {v4, v6, v2}, Lcom/android/volley/RequestQueue;-><init>(Lcom/android/volley/Cache;Lcom/android/volley/Network;)V
a=0;// 
a=0;//     .line 66
a=0;//     .local v4, "queue":Lcom/android/volley/RequestQueue;
a=0;//     #v4=(Reference,Lcom/android/volley/RequestQueue;);
a=0;//     invoke-virtual {v4}, Lcom/android/volley/RequestQueue;->start()V
a=0;// 
a=0;//     .line 68
a=0;//     return-object v4
a=0;// 
a=0;//     .line 59
a=0;//     .end local v2    # "network":Lcom/android/volley/Network;
a=0;//     .end local v4    # "queue":Lcom/android/volley/RequestQueue;
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v4=(Uninit);v6=(Integer);v7=(PosByte);
a=0;//     new-instance p1, Lcom/android/volley/toolbox/HttpClientStack;
a=0;// 
a=0;//     .end local p1    # "stack":Lcom/android/volley/toolbox/HttpStack;
a=0;//     #p1=(UninitRef,Lcom/android/volley/toolbox/HttpClientStack;);
a=0;//     invoke-static {v5}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/net/http/AndroidHttpClient;);
a=0;//     invoke-direct {p1, v6}, Lcom/android/volley/toolbox/HttpClientStack;-><init>(Lorg/apache/http/client/HttpClient;)V
a=0;// 
a=0;//     .restart local p1    # "stack":Lcom/android/volley/toolbox/HttpStack;
a=0;//     #p1=(Reference,Lcom/android/volley/toolbox/HttpClientStack;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 50
a=0;//     :catch_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     goto :goto_0
a=0;// .end method
}}
