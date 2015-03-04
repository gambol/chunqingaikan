package com.twocloo.base.cache.card; class ImgSDCache { void a() { int a;
a=0;// .class public Lcom/twocloo/base/cache/card/ImgSDCache;
a=0;// .super Lcom/twocloo/base/cache/card/AbsImgSDCache;
a=0;// .source "ImgSDCache.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/twocloo/base/cache/card/AbsImgSDCache",
a=0;//         "<",
a=0;//         "Landroid/graphics/Bitmap;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BYTE:J = 0x1L
a=0;// 
a=0;// .field private static final KB:J = 0x400L
a=0;// 
a=0;// .field private static final MB:J = 0x100000L
a=0;// 
a=0;// .field private static final PIC_AVAILABLE_MIN_CACHE_SIZE:J = 0xa00000L
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private picPath:Ljava/lang/String;
a=0;// 
a=0;// .field protected picRootPath:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "picPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/cache/card/AbsImgSDCache;-><init>()V
a=0;// 
a=0;//     .line 26
a=0;//     #p0=(Reference,Lcom/twocloo/base/cache/card/ImgSDCache;);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/card/ImgSDCache;->getRootPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/twocloo/base/cache/card/ImgSDCache;->picPath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/base/cache/card/ImgSDCache;->picRootPath:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     iput-object p1, p0, Lcom/twocloo/base/cache/card/ImgSDCache;->picPath:Ljava/lang/String;
a=0;// 
a=0;//     .line 31
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/card/ImgSDCache;->getRootPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/base/cache/card/ImgSDCache;->picRootPath:Ljava/lang/String;
a=0;// 
a=0;//     .line 34
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/card/ImgSDCache;->available()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/twocloo/base/cache/card/ImgSDCache;->picRootPath:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/cache/card/ImgSDCache;->checkPicPath(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private checkPicExists(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p1, "picPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 180
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method private static checkPicPath(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p0, "picPath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 170
a=0;//     .local v0, "file":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 171
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 172
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method private cleanFolder(Ljava/lang/String;)V
a=0;//     .locals 5
a=0;//     .param p1, "filePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 188
a=0;//     .local v0, "f":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 189
a=0;//     invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 190
a=0;//     .local v2, "files":[Ljava/io/File;
a=0;//     #v2=(Reference,[Ljava/io/File;);
a=0;//     array-length v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);
a=0;//     if-lt v3, v4, :cond_1
a=0;// 
a=0;//     .line 193
a=0;//     .end local v2    # "files":[Ljava/io/File;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 190
a=0;//     .restart local v2    # "files":[Ljava/io/File;
a=0;//     :cond_1
a=0;//     #v2=(Reference,[Ljava/io/File;);v4=(Integer);
a=0;//     aget-object v1, v2, v3
a=0;// 
a=0;//     .line 191
a=0;//     .local v1, "file":Ljava/io/File;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 190
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getPic(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p1, "picUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 136
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StorageUtils;->convertUrlToFileName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 137
a=0;//     .local v2, "picPath":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/twocloo/base/cache/card/ImgSDCache;->picRootPath:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 139
a=0;//     .local v1, "fullPicPath":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/base/cache/card/ImgSDCache;->picRootPath:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4}, Lcom/twocloo/base/cache/card/ImgSDCache;->checkPicPath(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 141
a=0;//     invoke-direct {p0, v1}, Lcom/twocloo/base/cache/card/ImgSDCache;->checkPicExists(Ljava/lang/String;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 149
a=0;//     .end local v1    # "fullPicPath":Ljava/lang/String;
a=0;//     .end local v2    # "picPath":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 145
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 146
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 149
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getPicBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 3
a=0;//     .param p1, "picUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StringUtils;->isNotBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 155
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/base/cache/card/ImgSDCache;->getPic(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 156
a=0;//     .local v1, "filePath":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 162
a=0;//     .end local v1    # "filePath":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 158
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 159
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 162
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public get(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Lcom/twocloo/base/cache/card/ImgSDCache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Landroid/graphics/Bitmap;
a=0;//     .locals 3
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/card/ImgSDCache;->available()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 98
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 102
a=0;//     .local v0, "key":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 103
a=0;//     invoke-interface {p2}, Lcom/twocloo/base/cache/KeyCreater;->create()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 107
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/base/cache/card/ImgSDCache;->getPicBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 105
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Null);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Landroid/graphics/Bitmap;
a=0;//     .locals 3
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;//     .param p3, "timeOut"    # J
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 112
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/card/ImgSDCache;->available()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 115
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 119
a=0;//     .local v0, "key":Ljava/lang/String;
a=0;//     #v0=(Null);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .line 120
a=0;//     invoke-interface {p2}, Lcom/twocloo/base/cache/KeyCreater;->create()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 124
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/twocloo/base/cache/card/ImgSDCache;->getPicBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 122
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Null);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/base/cache/card/ImgSDCache;->get(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/card/ImgSDCache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0, p1, p2, p3, p4}, Lcom/twocloo/base/cache/card/ImgSDCache;->get(Ljava/lang/String;Lcom/twocloo/base/cache/KeyCreater;J)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Landroid/graphics/Bitmap;)Z
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "bm"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0, v0}, Lcom/twocloo/base/cache/card/ImgSDCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/twocloo/base/cache/Filter;)Z
a=0;//     .locals 1
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "bm"    # Landroid/graphics/Bitmap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     .local p3, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Landroid/graphics/Bitmap;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, p3, v0}, Lcom/twocloo/base/cache/card/ImgSDCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public put(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;//     .locals 7
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p2, "bm"    # Landroid/graphics/Bitmap;
a=0;//     .param p4, "keyCreater"    # Lcom/twocloo/base/cache/KeyCreater;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             "Lcom/twocloo/base/cache/Filter",
a=0;//             "<",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;",
a=0;//             "Lcom/twocloo/base/cache/KeyCreater;",
a=0;//             ")Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p3, "filter":Lcom/twocloo/base/cache/Filter;, "Lcom/twocloo/base/cache/Filter<Landroid/graphics/Bitmap;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/card/ImgSDCache;->available()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     invoke-interface {p3, p2}, Lcom/twocloo/base/cache/Filter;->accept(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 65
a=0;//     :cond_2
a=0;//     const-wide/32 v3, 0xa00000
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/base/cache/card/ImgSDCache;->getAvailableMemorySize()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v3, p0, Lcom/twocloo/base/cache/card/ImgSDCache;->picRootPath:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v3}, Lcom/twocloo/base/cache/card/ImgSDCache;->cleanFolder(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 68
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 70
a=0;//     .local v1, "key":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     .line 71
a=0;//     invoke-interface {p4}, Lcom/twocloo/base/cache/KeyCreater;->create()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 76
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lcom/twocloo/base/cache/card/ImgSDCache;->picRootPath:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, p2}, Lcom/twocloo/base/util/HttpUtils;->saveImage(Ljava/lang/String;Landroid/graphics/Bitmap;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :cond_4
a=0;//     #v1=(Null);v2=(Null);v3=(Conflicted);v4=(LongHi);
a=0;//     invoke-static {p1}, Lcom/twocloo/base/util/StorageUtils;->convertUrlToFileName(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 78
a=0;//     :catch_0
a=0;//     #v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic put(Ljava/lang/String;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p2, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lcom/twocloo/base/cache/card/ImgSDCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic put(Ljava/lang/String;Ljava/lang/Object;Lcom/twocloo/base/cache/Filter;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p2, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     check-cast p3, Lcom/twocloo/base/cache/Filter;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3}, Lcom/twocloo/base/cache/card/ImgSDCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/twocloo/base/cache/Filter;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic put(Ljava/lang/String;Ljava/lang/Object;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p2, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     check-cast p3, Lcom/twocloo/base/cache/Filter;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3, p4}, Lcom/twocloo/base/cache/card/ImgSDCache;->put(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/twocloo/base/cache/Filter;Lcom/twocloo/base/cache/KeyCreater;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
