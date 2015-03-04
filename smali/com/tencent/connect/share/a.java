package com.tencent.connect.share; class a { void a() { int a;
a=0;// .class public Lcom/tencent/connect/share/a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static final a(Landroid/graphics/BitmapFactory$Options;II)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 328
a=0;//     invoke-static {p0, p1, p2}, Lcom/tencent/connect/share/a;->b(Landroid/graphics/BitmapFactory$Options;II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 332
a=0;//     #v1=(Integer);
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-gt v1, v0, :cond_0
a=0;// 
a=0;//     .line 333
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 334
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 335
a=0;//     shl-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 338
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     add-int/lit8 v0, v1, 0x7
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     mul-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     .line 341
a=0;//     :cond_1
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 192
a=0;//     #v1=(Null);
a=0;//     new-instance v5, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     .line 193
a=0;//     #v5=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 194
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 195
a=0;//     #v2=(Integer);
a=0;//     if-le v0, v2, :cond_0
a=0;// 
a=0;//     .line 196
a=0;//     :goto_0
a=0;//     int-to-float v2, p1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float v0, v2, v0
a=0;// 
a=0;//     .line 197
a=0;//     invoke-virtual {v5, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Integer);v3=(Uninit);v4=(Uninit);v6=(Uninit);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 195
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final a(Ljava/lang/String;I)Landroid/graphics/Bitmap;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 276
a=0;//     #v5=(Byte);
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 305
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 279
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v3, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 280
a=0;//     #v3=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 281
a=0;//     invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 282
a=0;//     iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     .line 283
a=0;//     #v0=(Integer);
a=0;//     iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     .line 284
a=0;//     #v1=(Integer);
a=0;//     iget-boolean v4, v3, Landroid/graphics/BitmapFactory$Options;->mCancel:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     iget v4, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v4, v5, :cond_2
a=0;// 
a=0;//     iget v4, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     if-ne v4, v5, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 286
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 288
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v1, :cond_5
a=0;// 
a=0;//     .line 289
a=0;//     :goto_1
a=0;//     sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     iput-object v1, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 290
a=0;//     if-le v0, p1, :cond_4
a=0;// 
a=0;//     .line 291
a=0;//     mul-int v0, p1, p1
a=0;// 
a=0;//     invoke-static {v3, v5, v0}, Lcom/tencent/connect/share/a;->a(Landroid/graphics/BitmapFactory$Options;II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 294
a=0;//     :cond_4
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 295
a=0;//     invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 296
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .line 297
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 288
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 299
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v1=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     .line 300
a=0;//     #v1=(Integer);
a=0;//     iget v2, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     .line 301
a=0;//     #v2=(Integer);
a=0;//     if-le v1, v2, :cond_7
a=0;// 
a=0;//     .line 302
a=0;//     :goto_2
a=0;//     if-le v1, p1, :cond_0
a=0;// 
a=0;//     .line 303
a=0;//     invoke-static {v0, p1}, Lcom/tencent/connect/share/a;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 301
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected static final a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 211
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     .line 214
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 216
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 217
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 218
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 220
a=0;//     :cond_1
a=0;//     if-eqz p0, :cond_2
a=0;// 
a=0;//     .line 223
a=0;//     :try_start_0
a=0;//     new-instance v2, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 224
a=0;//     #v2=(Reference,Ljava/io/FileOutputStream;);
a=0;//     sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v3, 0x50
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p0, v1, v3, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     .line 226
a=0;//     invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 227
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 238
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 230
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 232
a=0;//     invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     .line 238
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 233
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 235
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static final a(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/utils/AsynLoadImgBack;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     #v2=(Null);
a=0;//     const-string v0, "AsynScaleCompressImage"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "scaleCompressImage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 48
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-interface {p2, v0, v2}, Lcom/tencent/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Lcom/tencent/connect/share/a$2;);
a=0;//     return-void
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Null);
a=0;//     invoke-static {}, Lcom/tencent/utils/Util;->hasSDCard()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-interface {p2, v0, v2}, Lcom/tencent/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Lcom/tencent/connect/share/a$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/share/a$1;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1, p2}, Lcom/tencent/connect/share/a$1;-><init>(Landroid/os/Looper;Lcom/tencent/utils/AsynLoadImgBack;)V
a=0;// 
a=0;//     .line 76
a=0;//     #v0=(Reference,Lcom/tencent/connect/share/a$1;);
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v2, Lcom/tencent/connect/share/a$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/connect/share/a$2;);
a=0;//     invoke-direct {v2, p1, v0}, Lcom/tencent/connect/share/a$2;-><init>(Ljava/lang/String;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/share/a$2;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final a(Landroid/content/Context;Ljava/util/ArrayList;Lcom/tencent/utils/AsynLoadImgBack;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Lcom/tencent/utils/AsynLoadImgBack;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 119
a=0;//     #v2=(Null);
a=0;//     const-string v0, "AsynScaleCompressImage"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "batchScaleCompressImage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 120
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-interface {p2, v0, v2}, Lcom/tencent/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V
a=0;// 
a=0;//     .line 183
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Lcom/tencent/connect/share/a$4;);
a=0;//     return-void
a=0;// 
a=0;//     .line 125
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Null);
a=0;//     invoke-static {}, Lcom/tencent/utils/Util;->hasSDCard()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 127
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-interface {p2, v0, v2}, Lcom/tencent/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 130
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Lcom/tencent/connect/share/a$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/share/a$3;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1, p2}, Lcom/tencent/connect/share/a$3;-><init>(Landroid/os/Looper;Lcom/tencent/utils/AsynLoadImgBack;)V
a=0;// 
a=0;//     .line 143
a=0;//     #v0=(Reference,Lcom/tencent/connect/share/a$3;);
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v2, Lcom/tencent/connect/share/a$4;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/connect/share/a$4;);
a=0;//     invoke-direct {v2, p1, v0}, Lcom/tencent/connect/share/a$4;-><init>(Ljava/util/ArrayList;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/connect/share/a$4;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Ljava/lang/String;II)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     invoke-static {p0, p1, p2}, Lcom/tencent/connect/share/a;->b(Ljava/lang/String;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static b(Landroid/graphics/BitmapFactory$Options;II)I
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v10, -0x1
a=0;// 
a=0;//     .line 346
a=0;//     #v10=(Byte);
a=0;//     iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     .line 347
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     int-to-double v4, v0
a=0;// 
a=0;//     .line 349
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     if-ne p2, v10, :cond_1
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 351
a=0;//     :goto_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ne p1, v10, :cond_2
a=0;// 
a=0;//     const/16 v2, 0x80
a=0;// 
a=0;//     .line 355
a=0;//     :goto_1
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v0, :cond_3
a=0;// 
a=0;//     .line 366
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     return v0
a=0;// 
a=0;//     .line 349
a=0;//     :cond_1
a=0;//     #v2=(DoubleLo);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     mul-double v6, v2, v4
a=0;// 
a=0;//     #v6=(DoubleLo);v7=(DoubleHi);
a=0;//     int-to-double v8, p2
a=0;// 
a=0;//     #v8=(DoubleLo);v9=(DoubleHi);
a=0;//     div-double/2addr v6, v8
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     double-to-int v0, v6
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 351
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     int-to-double v6, p1
a=0;// 
a=0;//     #v6=(DoubleLo);v7=(DoubleHi);
a=0;//     div-double/2addr v2, v6
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     int-to-double v6, p1
a=0;// 
a=0;//     div-double/2addr v4, v6
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(DD)D
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     double-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 360
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ne p2, v10, :cond_4
a=0;// 
a=0;//     if-ne p1, v10, :cond_4
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 362
a=0;//     #v0=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 363
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     if-eq p1, v10, :cond_0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 366
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static final b(Ljava/lang/String;II)Z
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 247
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 267
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 250
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Byte);v7=(Uninit);
a=0;//     new-instance v5, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 251
a=0;//     #v5=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     iput-boolean v3, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 252
a=0;//     invoke-static {p0, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 253
a=0;//     iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     .line 254
a=0;//     #v0=(Integer);
a=0;//     iget v1, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     .line 255
a=0;//     #v1=(Integer);
a=0;//     iget-boolean v4, v5, Landroid/graphics/BitmapFactory$Options;->mCancel:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     iget v4, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v4, v6, :cond_1
a=0;// 
a=0;//     iget v4, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     if-ne v4, v6, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 257
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 259
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v1, :cond_4
a=0;// 
a=0;//     move v4, v0
a=0;// 
a=0;//     .line 260
a=0;//     :goto_1
a=0;//     if-ge v0, v1, :cond_5
a=0;// 
a=0;//     .line 261
a=0;//     :goto_2
a=0;//     const-string v1, "AsynScaleCompressImage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "longSide="
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "shortSide="
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v1, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 262
a=0;//     sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     iput-object v1, v5, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 264
a=0;//     if-gt v4, p2, :cond_3
a=0;// 
a=0;//     if-le v0, p1, :cond_6
a=0;// 
a=0;//     :cond_3
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 265
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);v6=(Byte);v7=(Uninit);
a=0;//     move v4, v1
a=0;// 
a=0;//     .line 259
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 260
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap$Config;);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 267
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
