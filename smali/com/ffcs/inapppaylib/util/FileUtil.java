package com.ffcs.inapppaylib.util; class FileUtil { void a() { int a;
a=0;// .class public Lcom/ffcs/inapppaylib/util/FileUtil;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FileUtil.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/util/FileUtil;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getFromAssets(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "fileName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-static {p0, p1}, Lcom/ffcs/inapppaylib/util/FileUtil;->openAssetsFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-direct {v2, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 17
a=0;//     .local v2, "isr":Ljava/io/InputStreamReader;
a=0;//     #v2=(Reference,Ljava/io/InputStreamReader;);
a=0;//     new-instance v0, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 18
a=0;//     .local v0, "br":Ljava/io/BufferedReader;
a=0;//     #v0=(Reference,Ljava/io/BufferedReader;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 19
a=0;//     .local v3, "line":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 20
a=0;//     .local v4, "result":Ljava/lang/StringBuilder;
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 22
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 25
a=0;//     .end local v0    # "br":Ljava/io/BufferedReader;
a=0;//     .end local v2    # "isr":Ljava/io/InputStreamReader;
a=0;//     .end local v3    # "line":Ljava/lang/String;
a=0;//     .end local v4    # "result":Ljava/lang/StringBuilder;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 21
a=0;//     .restart local v0    # "br":Ljava/io/BufferedReader;
a=0;//     .restart local v2    # "isr":Ljava/io/InputStreamReader;
a=0;//     .restart local v3    # "line":Ljava/lang/String;
a=0;//     .restart local v4    # "result":Ljava/lang/StringBuilder;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/BufferedReader;);v1=(Uninit);v2=(Reference,Ljava/io/InputStreamReader;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 23
a=0;//     .end local v0    # "br":Ljava/io/BufferedReader;
a=0;//     .end local v2    # "isr":Ljava/io/InputStreamReader;
a=0;//     .end local v3    # "line":Ljava/lang/String;
a=0;//     .end local v4    # "result":Ljava/lang/StringBuilder;
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 24
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 25
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getImageFromAssets(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "fileName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-static {p0, p1}, Lcom/ffcs/inapppaylib/util/FileUtil;->openAssetsFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "is":Ljava/io/InputStream;
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static openAssetsFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "fileName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 34
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 32
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 33
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 34
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
