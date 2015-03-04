package com.twocloo.base.cache.lru; class BitmapDiskLruCache { void a() { int a;
a=0;// .class public Lcom/twocloo/base/cache/lru/BitmapDiskLruCache;
a=0;// .super Lcom/twocloo/base/cache/lru/DiskLruCache;
a=0;// .source "BitmapDiskLruCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/cache/lru/DiskLruCache",
a=0;//         "<",
a=0;//         "Landroid/graphics/Bitmap;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IO_BUFFER_SIZE:I = 0x1000
a=0;// 
a=0;// .field private static final mCompressFormat:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;// .field private static final mCompressQuality:I = 0x46
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     sput-object v0, Lcom/twocloo/base/cache/lru/BitmapDiskLruCache;->mCompressFormat:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     .line 22
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/io/File;J)V
a=0;//     .locals 0
a=0;//     .param p1, "cacheDir"    # Ljava/io/File;
a=0;//     .param p2, "maxByteSize"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcom/twocloo/base/cache/lru/DiskLruCache;-><init>(Ljava/io/File;J)V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/lru/BitmapDiskLruCache;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected readFromFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;//     .param p1, "file"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/OutOfMemoryError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic readFromFile(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/cache/lru/BitmapDiskLruCache;->readFromFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected writeToFile(Landroid/graphics/Bitmap;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;//     .param p1, "bitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "file"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Ljava/io/FileNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 32
a=0;//     .local v0, "out":Ljava/io/OutputStream;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v3, 0x1000
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 33
a=0;//     .end local v0    # "out":Ljava/io/OutputStream;
a=0;//     .local v1, "out":Ljava/io/OutputStream;
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     sget-object v2, Lcom/twocloo/base/cache/lru/BitmapDiskLruCache;->mCompressFormat:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v3, 0x46
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p1, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 35
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     .line 33
a=0;//     :cond_0
a=0;//     return v2
a=0;// 
a=0;//     .line 34
a=0;//     .end local v1    # "out":Ljava/io/OutputStream;
a=0;//     .restart local v0    # "out":Ljava/io/OutputStream;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 35
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/BufferedOutputStream;);v2=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 36
a=0;//     invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     .line 38
a=0;//     :cond_1
a=0;//     throw v2
a=0;// 
a=0;//     .line 34
a=0;//     .end local v0    # "out":Ljava/io/OutputStream;
a=0;//     .restart local v1    # "out":Ljava/io/OutputStream;
a=0;//     :catchall_1
a=0;//     #v0=(Null);v1=(Reference,Ljava/io/BufferedOutputStream;);v3=(PosShort);
a=0;//     move-exception v2
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .end local v1    # "out":Ljava/io/OutputStream;
a=0;//     .restart local v0    # "out":Ljava/io/OutputStream;
a=0;//     #v0=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic writeToFile(Ljava/lang/Object;Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/lru/BitmapDiskLruCache;->writeToFile(Landroid/graphics/Bitmap;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
