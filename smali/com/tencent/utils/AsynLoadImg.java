package com.tencent.utils; class AsynLoadImg { void a() { int a;
a=0;// .class public Lcom/tencent/utils/AsynLoadImg;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static d:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/app/Activity;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Lcom/tencent/utils/AsynLoadImgBack;
a=0;// 
a=0;// .field private e:J
a=0;// 
a=0;// .field private f:Landroid/os/Handler;
a=0;// 
a=0;// .field private g:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 140
a=0;//     #p0=(Reference,Lcom/tencent/utils/AsynLoadImg;);
a=0;//     new-instance v0, Lcom/tencent/utils/AsynLoadImg$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/utils/AsynLoadImg$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/utils/AsynLoadImg$2;-><init>(Lcom/tencent/utils/AsynLoadImg;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/AsynLoadImg$2;);
a=0;//     iput-object v0, p0, Lcom/tencent/utils/AsynLoadImg;->g:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 46
a=0;//     iput-object p1, p0, Lcom/tencent/utils/AsynLoadImg;->a:Landroid/app/Activity;
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v0, Lcom/tencent/utils/AsynLoadImg$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/utils/AsynLoadImg$1;);
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/tencent/utils/AsynLoadImg$1;-><init>(Lcom/tencent/utils/AsynLoadImg;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/AsynLoadImg$1;);
a=0;//     iput-object v0, p0, Lcom/tencent/utils/AsynLoadImg;->f:Landroid/os/Handler;
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/utils/AsynLoadImg;)Lcom/tencent/utils/AsynLoadImgBack;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/tencent/utils/AsynLoadImg;->c:Lcom/tencent/utils/AsynLoadImgBack;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/AsynLoadImgBack;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     sget-object v0, Lcom/tencent/utils/AsynLoadImg;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/utils/AsynLoadImg;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/tencent/utils/AsynLoadImg;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/tencent/utils/AsynLoadImg;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-object v0, p0, Lcom/tencent/utils/AsynLoadImg;->f:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/tencent/utils/AsynLoadImg;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     iget-wide v0, p0, Lcom/tencent/utils/AsynLoadImg;->e:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public static getbitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     const-string v0, "AsynLoadImg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "getbitmap:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 123
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 124
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 126
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 127
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 129
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 130
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 132
a=0;//     const-string v1, "AsynLoadImg"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "image download finished."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 138
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 133
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 134
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 135
a=0;//     const-string v0, "AsynLoadImg"
a=0;// 
a=0;//     const-string v1, "getbitmap bmp fail---"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 136
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public save(Ljava/lang/String;Lcom/tencent/utils/AsynLoadImgBack;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 64
a=0;//     #v2=(Null);
a=0;//     const-string v0, "AsynLoadImg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "--save---"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 65
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-interface {p2, v0, v2}, Lcom/tencent/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 80
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcom/tencent/utils/Util;->hasSDCard()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-interface {p2, v0, v2}, Lcom/tencent/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/tmp/"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/utils/AsynLoadImg;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 75
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/utils/AsynLoadImg;->e:J
a=0;// 
a=0;//     .line 77
a=0;//     iput-object p1, p0, Lcom/tencent/utils/AsynLoadImg;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 78
a=0;//     iput-object p2, p0, Lcom/tencent/utils/AsynLoadImg;->c:Lcom/tencent/utils/AsynLoadImgBack;
a=0;// 
a=0;//     .line 79
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     iget-object v1, p0, Lcom/tencent/utils/AsynLoadImg;->g:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public saveFile(Landroid/graphics/Bitmap;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     sget-object v0, Lcom/tencent/utils/AsynLoadImg;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 91
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 92
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdir()Z
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 96
a=0;//     const-string v1, "AsynLoadImg"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "saveFile:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 97
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 99
a=0;//     #v0=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v2, 0x50
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 108
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 103
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 104
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 105
a=0;//     const-string v0, "AsynLoadImg"
a=0;// 
a=0;//     const-string v1, "saveFile bmp fail---"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 106
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
