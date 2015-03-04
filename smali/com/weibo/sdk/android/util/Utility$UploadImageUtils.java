package com.weibo.sdk.android.util; class Utility$UploadImageUtils { void a() { int a;
a=0;// .class public final Lcom/weibo/sdk/android/util/Utility$UploadImageUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Utility.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/weibo/sdk/android/util/Utility;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x19
a=0;//     name = "UploadImageUtils"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/util/Utility$UploadImageUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static revitionImageSize(Ljava/lang/String;II)V
a=0;//     .locals 11
a=0;//     .param p0, "picfile"    # Ljava/lang/String;
a=0;//     .param p1, "size"    # I
a=0;//     .param p2, "quality"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 397
a=0;//     if-gtz p1, :cond_0
a=0;// 
a=0;//     .line 398
a=0;//     new-instance v7, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v8, "size must be greater than 0!"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 401
a=0;//     :cond_0
a=0;//     #v7=(Uninit);v8=(Uninit);
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->access$0(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 402
a=0;//     new-instance v7, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     const-string p0, "null"
a=0;// 
a=0;//     .end local p0    # "picfile":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     invoke-direct {v7, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 405
a=0;//     .restart local p0    # "picfile":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v7=(Boolean);
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/BitmapHelper;->verifyBitmap(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 406
a=0;//     new-instance v7, Ljava/io/IOException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v8, ""
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/IOException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 409
a=0;//     :cond_3
a=0;//     #v7=(Boolean);v8=(Uninit);
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 410
a=0;//     .local v2, "input":Ljava/io/FileInputStream;
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v3, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 411
a=0;//     .local v3, "opts":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v3=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 412
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v2, v7, v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 414
a=0;//     :try_start_0
a=0;//     invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 420
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 421
a=0;//     .local v5, "rate":I
a=0;//     #v5=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 422
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v7=(Integer);
a=0;//     iget v7, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     shr-int/2addr v7, v1
a=0;// 
a=0;//     if-gt v7, p1, :cond_4
a=0;// 
a=0;//     iget v7, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     shr-int/2addr v7, v1
a=0;// 
a=0;//     if-gt v7, p1, :cond_4
a=0;// 
a=0;//     .line 423
a=0;//     move v5, v1
a=0;// 
a=0;//     .line 428
a=0;//     #v5=(Integer);
a=0;//     const-wide/high16 v7, 0x4000000000000000L    # 2.0
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     int-to-double v9, v5
a=0;// 
a=0;//     #v9=(DoubleLo);v10=(DoubleHi);
a=0;//     invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(DoubleLo);v8=(DoubleHi);
a=0;//     double-to-int v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 429
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 431
a=0;//     invoke-static {p0, v3}, Lcom/weibo/sdk/android/util/Utility$UploadImageUtils;->safeDecodeBimtapFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 433
a=0;//     .local v6, "temp":Landroid/graphics/Bitmap;
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 434
a=0;//     new-instance v7, Ljava/io/IOException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v8, "Bitmap decode error!"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/IOException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 415
a=0;//     .end local v1    # "i":I
a=0;//     .end local v5    # "rate":I
a=0;//     .end local v6    # "temp":Landroid/graphics/Bitmap;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 417
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 421
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v5    # "rate":I
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Integer);v5=(Null);v7=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 437
a=0;//     .restart local v6    # "temp":Landroid/graphics/Bitmap;
a=0;//     :cond_5
a=0;//     #v5=(Integer);v6=(Reference,Landroid/graphics/Bitmap;);v7=(Null);v8=(DoubleHi);v9=(DoubleLo);v10=(DoubleHi);
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->access$1(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 438
a=0;//     invoke-static {p0}, Lcom/weibo/sdk/android/util/Utility;->access$2(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 439
a=0;//     new-instance v4, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v4, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 440
a=0;//     .local v4, "output":Ljava/io/FileOutputStream;
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     iget-object v7, v3, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     .line 441
a=0;//     iget-object v7, v3, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;
a=0;// 
a=0;//     const-string v8, "png"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_6
a=0;// 
a=0;//     .line 442
a=0;//     sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     invoke-virtual {v6, v7, p2, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 447
a=0;//     :goto_2
a=0;//     :try_start_1
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 451
a=0;//     :goto_3
a=0;//     invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 452
a=0;//     return-void
a=0;// 
a=0;//     .line 444
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);
a=0;//     sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     invoke-virtual {v6, v7, p2, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 448
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 449
a=0;//     .restart local v0    # "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private static revitionImageSizeHD(Ljava/lang/String;II)V
a=0;//     .locals 20
a=0;//     .param p0, "picfile"    # Ljava/lang/String;
a=0;//     .param p1, "size"    # I
a=0;//     .param p2, "quality"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     if-gtz p1, :cond_0
a=0;// 
a=0;//     .line 314
a=0;//     new-instance v16, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v17, "size must be greater than 0!"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v16 .. v17}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v16
a=0;// 
a=0;//     .line 316
a=0;//     :cond_0
a=0;//     #v16=(Uninit);v17=(Uninit);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/weibo/sdk/android/util/Utility;->access$0(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Boolean);
a=0;//     if-nez v16, :cond_2
a=0;// 
a=0;//     .line 317
a=0;//     new-instance v16, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     const-string p0, "null"
a=0;// 
a=0;//     .end local p0    # "picfile":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);v16=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v16
a=0;// 
a=0;//     .line 320
a=0;//     .restart local p0    # "picfile":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v16=(Boolean);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/weibo/sdk/android/util/BitmapHelper;->verifyBitmap(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     if-nez v16, :cond_3
a=0;// 
a=0;//     .line 321
a=0;//     new-instance v16, Ljava/io/IOException;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v17, ""
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v16 .. v17}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v16=(Reference,Ljava/io/IOException;);
a=0;//     throw v16
a=0;// 
a=0;//     .line 324
a=0;//     :cond_3
a=0;//     #v16=(Boolean);v17=(Uninit);
a=0;//     mul-int/lit8 v12, p1, 0x2
a=0;// 
a=0;//     .line 325
a=0;//     .local v12, "photoSizesOrg":I
a=0;//     #v12=(Integer);
a=0;//     new-instance v6, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 326
a=0;//     .local v6, "input":Ljava/io/FileInputStream;
a=0;//     #v6=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v8, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v8}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 327
a=0;//     .local v8, "opts":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v8=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     #v16=(One);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, v8, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 328
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v6, v0, v8}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 330
a=0;//     :try_start_0
a=0;//     invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 336
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 337
a=0;//     .local v13, "rate":I
a=0;//     #v13=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 338
a=0;//     .local v5, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v5=(Integer);v16=(Integer);
a=0;//     iget v0, v8, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     shr-int v16, v16, v5
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-gt v0, v12, :cond_4
a=0;// 
a=0;//     iget v0, v8, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     shr-int v16, v16, v5
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-gt v0, v12, :cond_4
a=0;// 
a=0;//     .line 339
a=0;//     move v13, v5
a=0;// 
a=0;//     .line 344
a=0;//     #v13=(Integer);
a=0;//     const-wide/high16 v16, 0x4000000000000000L    # 2.0
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     int-to-double v0, v13
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     move-wide/from16 v18, v0
a=0;// 
a=0;//     #v18=(DoubleLo);v19=(DoubleHi);
a=0;//     invoke-static/range {v16 .. v19}, Ljava/lang/Math;->pow(DD)D
a=0;// 
a=0;//     move-result-wide v16
a=0;// 
a=0;//     #v16=(DoubleLo);v17=(DoubleHi);
a=0;//     move-wide/from16 v0, v16
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     iput v0, v8, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 345
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, v8, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 347
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v8}, Lcom/weibo/sdk/android/util/Utility$UploadImageUtils;->safeDecodeBimtapFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 349
a=0;//     .local v15, "temp":Landroid/graphics/Bitmap;
a=0;//     #v15=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v15, :cond_5
a=0;// 
a=0;//     .line 350
a=0;//     new-instance v16, Ljava/io/IOException;
a=0;// 
a=0;//     #v16=(UninitRef,Ljava/io/IOException;);
a=0;//     const-string v17, "Bitmap decode error!"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v16 .. v17}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v16=(Reference,Ljava/io/IOException;);
a=0;//     throw v16
a=0;// 
a=0;//     .line 331
a=0;//     .end local v5    # "i":I
a=0;//     .end local v13    # "rate":I
a=0;//     .end local v15    # "temp":Landroid/graphics/Bitmap;
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);v4=(Uninit);v5=(Uninit);v13=(Uninit);v15=(Uninit);v16=(Null);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 333
a=0;//     .local v4, "e1":Ljava/lang/Exception;
a=0;//     #v4=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 337
a=0;//     .end local v4    # "e1":Ljava/lang/Exception;
a=0;//     .restart local v5    # "i":I
a=0;//     .restart local v13    # "rate":I
a=0;//     :cond_4
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Integer);v13=(Null);v16=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 353
a=0;//     .restart local v15    # "temp":Landroid/graphics/Bitmap;
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(DoubleHi);v13=(Integer);v15=(Reference,Landroid/graphics/Bitmap;);v16=(Null);v17=(DoubleHi);v18=(DoubleLo);v19=(DoubleHi);
a=0;//     invoke-static/range {p0 .. p0}, Lcom/weibo/sdk/android/util/Utility;->access$1(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 354
a=0;//     invoke-static/range {p0 .. p0}, Lcom/weibo/sdk/android/util/Utility;->access$2(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 356
a=0;//     invoke-virtual {v15}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual {v15}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_8
a=0;// 
a=0;//     invoke-virtual {v15}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 357
a=0;//     .local v9, "org":I
a=0;//     :goto_2
a=0;//     #v9=(Integer);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     int-to-float v0, v9
a=0;// 
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Float);
a=0;//     div-float v14, v16, v17
a=0;// 
a=0;//     .line 359
a=0;//     .local v14, "rateOutPut":F
a=0;//     #v14=(Float);
a=0;//     const/high16 v16, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     cmpg-float v16, v14, v16
a=0;// 
a=0;//     #v16=(Byte);
a=0;//     if-gez v16, :cond_7
a=0;// 
a=0;//     .line 363
a=0;//     :goto_3
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(LongLo);v19=(LongHi);
a=0;//     invoke-virtual {v15}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     mul-float v16, v16, v14
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual {v15}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Float);
a=0;//     mul-float v17, v17, v14
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     sget-object v18, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v18=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static/range {v16 .. v18}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 370
a=0;//     .local v11, "outputBitmap":Landroid/graphics/Bitmap;
a=0;//     #v11=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v11, :cond_6
a=0;// 
a=0;//     .line 371
a=0;//     invoke-virtual {v15}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 373
a=0;//     :cond_6
a=0;//     new-instance v2, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v2, v11}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 374
a=0;//     .local v2, "canvas":Landroid/graphics/Canvas;
a=0;//     #v2=(Reference,Landroid/graphics/Canvas;);
a=0;//     new-instance v7, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     .line 375
a=0;//     .local v7, "matrix":Landroid/graphics/Matrix;
a=0;//     #v7=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v7, v14, v14}, Landroid/graphics/Matrix;->setScale(FF)V
a=0;// 
a=0;//     .line 376
a=0;//     new-instance v16, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v16=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct/range {v16 .. v16}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v16=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v2, v15, v7, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 377
a=0;//     invoke-virtual {v15}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 378
a=0;//     move-object v15, v11
a=0;// 
a=0;//     .line 380
a=0;//     .end local v2    # "canvas":Landroid/graphics/Canvas;
a=0;//     .end local v7    # "matrix":Landroid/graphics/Matrix;
a=0;//     .end local v11    # "outputBitmap":Landroid/graphics/Bitmap;
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v2=(Conflicted);v7=(Conflicted);v11=(Conflicted);v16=(Conflicted);v18=(Conflicted);
a=0;//     new-instance v10, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v10, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 381
a=0;//     .local v10, "output":Ljava/io/FileOutputStream;
a=0;//     #v10=(Reference,Ljava/io/FileOutputStream;);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     iget-object v0, v8, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v16, :cond_9
a=0;// 
a=0;//     .line 382
a=0;//     iget-object v0, v8, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     const-string v17, "png"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Boolean);
a=0;//     if-eqz v16, :cond_9
a=0;// 
a=0;//     .line 383
a=0;//     sget-object v16, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v16=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     move/from16 v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v15, v0, v1, v10}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 388
a=0;//     :goto_4
a=0;//     :try_start_2
a=0;//     #v17=(Conflicted);
a=0;//     invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     .line 394
a=0;//     :goto_5
a=0;//     invoke-virtual {v15}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 395
a=0;//     return-void
a=0;// 
a=0;//     .line 356
a=0;//     .end local v9    # "org":I
a=0;//     .end local v10    # "output":Ljava/io/FileOutputStream;
a=0;//     .end local v14    # "rateOutPut":F
a=0;//     :cond_8
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v14=(Uninit);v16=(Integer);v17=(Integer);v18=(DoubleLo);v19=(DoubleHi);
a=0;//     invoke-virtual {v15}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 365
a=0;//     .restart local v9    # "org":I
a=0;//     .restart local v14    # "rateOutPut":F
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v14=(Float);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(LongHi);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 366
a=0;//     .local v3, "e":Ljava/lang/OutOfMemoryError;
a=0;//     #v3=(Reference,Ljava/lang/OutOfMemoryError;);
a=0;//     invoke-static {}, Ljava/lang/System;->gc()V
a=0;// 
a=0;//     .line 367
a=0;//     float-to-double v0, v14
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);v17=(DoubleHi);
a=0;//     const-wide v18, 0x3fe999999999999aL    # 0.8
a=0;// 
a=0;//     #v18=(LongLo);
a=0;//     mul-double v16, v16, v18
a=0;// 
a=0;//     move-wide/from16 v0, v16
a=0;// 
a=0;//     double-to-float v14, v0
a=0;// 
a=0;//     .line 361
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 385
a=0;//     .end local v3    # "e":Ljava/lang/OutOfMemoryError;
a=0;//     .restart local v10    # "output":Ljava/io/FileOutputStream;
a=0;//     :cond_9
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v10=(Reference,Ljava/io/FileOutputStream;);v11=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     sget-object v16, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v16=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     move/from16 v1, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v15, v0, v1, v10}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 389
a=0;//     :catch_2
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 391
a=0;//     .local v3, "e":Ljava/lang/Exception;
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_5
a=0;// .end method
a=0;// 
a=0;// .method public static revitionPostImageSize(Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;//     .param p0, "picfile"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 455
a=0;//     :try_start_0
a=0;//     sget-boolean v1, Lcom/weibo/sdk/android/Weibo;->isWifi:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 456
a=0;//     const/16 v1, 0x640
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/16 v2, 0x4b
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p0, v1, v2}, Lcom/weibo/sdk/android/util/Utility$UploadImageUtils;->revitionImageSizeHD(Ljava/lang/String;II)V
a=0;// 
a=0;//     .line 462
a=0;//     :goto_0
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 466
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 459
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/16 v2, 0x4b
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p0, v1, v2}, Lcom/weibo/sdk/android/util/Utility$UploadImageUtils;->revitionImageSize(Ljava/lang/String;II)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 463
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 464
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 466
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static safeDecodeBimtapFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;//     .locals 9
a=0;//     .param p0, "bmpFile"    # Ljava/lang/String;
a=0;//     .param p1, "opts"    # Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     move-object v7, p1
a=0;// 
a=0;//     .line 478
a=0;//     .local v7, "optsTmp":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v7=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 479
a=0;//     new-instance v7, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     .end local v7    # "optsTmp":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v7=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v7}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 480
a=0;//     .restart local v7    # "optsTmp":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v7=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     iput v8, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 483
a=0;//     :cond_0
a=0;//     #v8=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 484
a=0;//     .local v1, "bmp":Landroid/graphics/Bitmap;
a=0;//     #v1=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 486
a=0;//     .local v5, "input":Ljava/io/FileInputStream;
a=0;//     #v5=(Null);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     .line 487
a=0;//     .local v0, "MAX_TRIAL":I
a=0;//     #v0=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     #v4=(Null);
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .end local v5    # "input":Ljava/io/FileInputStream;
a=0;//     .local v6, "input":Ljava/io/FileInputStream;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);v2=(Conflicted);v3=(Conflicted);v4=(Integer);v5=(Reference,Ljava/io/FileInputStream;);v6=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-lt v4, v8, :cond_1
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 512
a=0;//     .end local v6    # "input":Ljava/io/FileInputStream;
a=0;//     .restart local v5    # "input":Ljava/io/FileInputStream;
a=0;//     :goto_1
a=0;//     return-object v1
a=0;// 
a=0;//     .line 489
a=0;//     .end local v5    # "input":Ljava/io/FileInputStream;
a=0;//     .restart local v6    # "input":Ljava/io/FileInputStream;
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     new-instance v5, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v5, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_5
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     .line 490
a=0;//     .end local v6    # "input":Ljava/io/FileInputStream;
a=0;//     .restart local v5    # "input":Ljava/io/FileInputStream;
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v8=(Null);
a=0;//     invoke-static {v5, v8, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 492
a=0;//     :try_start_2
a=0;//     invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 493
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 494
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_4
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 498
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 499
a=0;//     .local v2, "e":Ljava/lang/OutOfMemoryError;
a=0;//     :goto_2
a=0;//     #v2=(Reference,Ljava/lang/OutOfMemoryError;);v8=(PosByte);
a=0;//     invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V
a=0;// 
a=0;//     .line 500
a=0;//     iget v8, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     mul-int/lit8 v8, v8, 0x2
a=0;// 
a=0;//     iput v8, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 502
a=0;//     :try_start_4
a=0;//     invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     .line 487
a=0;//     :goto_3
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     move-object v6, v5
a=0;// 
a=0;//     .end local v5    # "input":Ljava/io/FileInputStream;
a=0;//     .restart local v6    # "input":Ljava/io/FileInputStream;
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 503
a=0;//     .end local v6    # "input":Ljava/io/FileInputStream;
a=0;//     .restart local v5    # "input":Ljava/io/FileInputStream;
a=0;//     :catch_2
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 504
a=0;//     .local v3, "e1":Ljava/io/IOException;
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 507
a=0;//     .end local v2    # "e":Ljava/lang/OutOfMemoryError;
a=0;//     .end local v3    # "e1":Ljava/io/IOException;
a=0;//     .end local v5    # "input":Ljava/io/FileInputStream;
a=0;//     .restart local v6    # "input":Ljava/io/FileInputStream;
a=0;//     :catch_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v8=(PosByte);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 508
a=0;//     .end local v6    # "input":Ljava/io/FileInputStream;
a=0;//     .local v2, "e":Ljava/io/FileNotFoundException;
a=0;//     .restart local v5    # "input":Ljava/io/FileInputStream;
a=0;//     :goto_4
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 507
a=0;//     .end local v2    # "e":Ljava/io/FileNotFoundException;
a=0;//     :catch_4
a=0;//     #v2=(Conflicted);v8=(Null);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 498
a=0;//     .end local v5    # "input":Ljava/io/FileInputStream;
a=0;//     .restart local v6    # "input":Ljava/io/FileInputStream;
a=0;//     :catch_5
a=0;//     #v2=(Conflicted);v5=(Conflicted);v8=(PosByte);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/OutOfMemoryError;);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .end local v6    # "input":Ljava/io/FileInputStream;
a=0;//     .restart local v5    # "input":Ljava/io/FileInputStream;
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     goto :goto_2
a=0;// .end method
}}
