package com.twocloo.com.cn.utils; class StringUtil { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/StringUtil;
a=0;// .super Ljava/lang/Object;
a=0;// .source "StringUtil.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MAX_DECODE_PICTURE_SIZE:I = 0x2a3000
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "SDK_Sample.Util"
a=0;// 
a=0;// .field private static hexString:Ljava/lang/String;
a=0;// 
a=0;// .field private static mProgressDialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private static mToast:Landroid/widget/Toast;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     const-string v0, "0123456789ABCDEF"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/utils/StringUtil;->hexString:Ljava/lang/String;
a=0;// 
a=0;//     .line 353
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/StringUtil;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0()Landroid/widget/Toast;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     sget-object v0, Lcom/twocloo/com/cn/utils/StringUtil;->mToast:Landroid/widget/Toast;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Landroid/widget/Toast;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     sput-object p0, Lcom/twocloo/com/cn/utils/StringUtil;->mToast:Landroid/widget/Toast;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static bmpToByteArray(Landroid/graphics/Bitmap;Z)[B
a=0;//     .locals 5
a=0;//     .param p0, "bmp"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "needRecycle"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 153
a=0;//     .local v1, "output":Ljava/io/ByteArrayOutputStream;
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v4, 0x64
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p0, v3, v4, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 154
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 155
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 158
a=0;//     :cond_0
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 160
a=0;//     .local v2, "result":[B
a=0;//     :try_start_0
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 161
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 162
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static bytesToHexString([B)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "src"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 48
a=0;//     .local v2, "stringBuilder":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     array-length v4, p0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gtz v4, :cond_1
a=0;// 
a=0;//     .line 49
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 51
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v5=(Conflicted);
a=0;//     array-length v4, p0
a=0;// 
a=0;//     if-lt v1, v4, :cond_2
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_2
a=0;//     #v4=(Integer);
a=0;//     aget-byte v4, p0, v1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     and-int/lit16 v3, v4, 0xff
a=0;// 
a=0;//     .line 53
a=0;//     .local v3, "v":I
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 54
a=0;//     .local v0, "hv":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ge v4, v5, :cond_3
a=0;// 
a=0;//     .line 55
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 57
a=0;//     :cond_3
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 51
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static charToByte(C)B
a=0;//     .locals 1
a=0;//     .param p0, "c"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     const-string v0, "0123456789ABCDEF"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static computeInitialSampleSize(Landroid/graphics/BitmapFactory$Options;II)I
a=0;//     .locals 12
a=0;//     .param p0, "options"    # Landroid/graphics/BitmapFactory$Options;
a=0;//     .param p1, "minSideLength"    # I
a=0;//     .param p2, "maxNumOfPixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     .line 296
a=0;//     #v11=(Byte);
a=0;//     iget v7, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-double v4, v7
a=0;// 
a=0;//     .line 298
a=0;//     .local v4, "w":D
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     iget v7, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     int-to-double v0, v7
a=0;// 
a=0;//     .line 300
a=0;//     .local v0, "h":D
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     if-ne p2, v11, :cond_1
a=0;// 
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 304
a=0;//     .local v2, "lowerBound":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-ne p1, v11, :cond_2
a=0;// 
a=0;//     const/16 v3, 0x80
a=0;// 
a=0;//     .line 310
a=0;//     .local v3, "upperBound":I
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v2, :cond_3
a=0;// 
a=0;//     .line 330
a=0;//     .end local v2    # "lowerBound":I
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     return v2
a=0;// 
a=0;//     .line 302
a=0;//     .end local v3    # "upperBound":I
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);v7=(Integer);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     mul-double v7, v4, v0
a=0;// 
a=0;//     #v7=(DoubleLo);v8=(DoubleHi);
a=0;//     int-to-double v9, p2
a=0;// 
a=0;//     #v9=(DoubleLo);v10=(DoubleHi);
a=0;//     div-double/2addr v7, v9
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     double-to-int v2, v7
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 306
a=0;//     .restart local v2    # "lowerBound":I
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     int-to-double v7, p1
a=0;// 
a=0;//     #v7=(DoubleLo);v8=(DoubleHi);
a=0;//     div-double v7, v4, v7
a=0;// 
a=0;//     invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     .line 308
a=0;//     int-to-double v9, p1
a=0;// 
a=0;//     #v9=(DoubleLo);v10=(DoubleHi);
a=0;//     div-double v9, v0, v9
a=0;// 
a=0;//     invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     .line 306
a=0;//     invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(DD)D
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     double-to-int v3, v7
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 318
a=0;//     .restart local v3    # "upperBound":I
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-ne p2, v11, :cond_4
a=0;// 
a=0;//     .line 320
a=0;//     if-ne p1, v11, :cond_4
a=0;// 
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 322
a=0;//     #v2=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 324
a=0;//     :cond_4
a=0;//     #v2=(Integer);
a=0;//     if-eq p1, v11, :cond_0
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 330
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static computeSampleSize(Landroid/graphics/BitmapFactory$Options;II)I
a=0;//     .locals 3
a=0;//     .param p0, "options"    # Landroid/graphics/BitmapFactory$Options;
a=0;//     .param p1, "minSideLength"    # I
a=0;//     .param p2, "maxNumOfPixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     invoke-static {p0, p1, p2}, Lcom/twocloo/com/cn/utils/StringUtil;->computeInitialSampleSize(Landroid/graphics/BitmapFactory$Options;II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 273
a=0;//     .local v0, "initialSize":I
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-gt v0, v2, :cond_1
a=0;// 
a=0;//     .line 275
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 277
a=0;//     .local v1, "roundedSize":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     if-lt v1, v0, :cond_0
a=0;// 
a=0;//     .line 289
a=0;//     :goto_1
a=0;//     #v2=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 279
a=0;//     :cond_0
a=0;//     #v2=(PosByte);
a=0;//     shl-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 285
a=0;//     .end local v1    # "roundedSize":I
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     add-int/lit8 v2, v0, 0x7
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     mul-int/lit8 v1, v2, 0x8
a=0;// 
a=0;//     .restart local v1    # "roundedSize":I
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static final dismissDialog()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 455
a=0;//     sget-object v0, Lcom/twocloo/com/cn/utils/StringUtil;->mProgressDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 456
a=0;//     sget-object v0, Lcom/twocloo/com/cn/utils/StringUtil;->mProgressDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
a=0;// 
a=0;//     .line 457
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/utils/StringUtil;->mProgressDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 459
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static extractThumbNail(Ljava/lang/String;IIZ)Landroid/graphics/Bitmap;
a=0;//     .locals 18
a=0;//     .param p0, "path"    # Ljava/lang/String;
a=0;//     .param p1, "height"    # I
a=0;//     .param p2, "width"    # I
a=0;//     .param p3, "crop"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 355
a=0;//     if-eqz p0, :cond_3
a=0;// 
a=0;//     const-string v14, ""
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     if-nez v14, :cond_3
a=0;// 
a=0;//     if-lez p1, :cond_3
a=0;// 
a=0;//     if-lez p2, :cond_3
a=0;// 
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {v14}, Ljunit/framework/Assert;->assertTrue(Z)V
a=0;// 
a=0;//     .line 357
a=0;//     new-instance v11, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v11=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v11}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 360
a=0;//     .local v11, "options":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v11=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v14=(One);
a=0;//     iput-boolean v14, v11, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 361
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v11}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 362
a=0;//     .local v13, "tmp":Landroid/graphics/Bitmap;
a=0;//     #v13=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v13, :cond_0
a=0;// 
a=0;//     .line 363
a=0;//     invoke-virtual {v13}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 364
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 367
a=0;//     :cond_0
a=0;//     const-string v14, "SDK_Sample.Util"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "extractThumbNail: round="
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "x"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, ", crop="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     move/from16 v0, p3
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 368
a=0;//     iget v14, v11, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     int-to-double v14, v14
a=0;// 
a=0;//     #v14=(DoubleLo);v15=(DoubleHi);
a=0;//     const-wide/high16 v16, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     mul-double v14, v14, v16
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);v17=(DoubleHi);
a=0;//     div-double v4, v14, v16
a=0;// 
a=0;//     .line 369
a=0;//     .local v4, "beY":D
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     iget v14, v11, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     int-to-double v14, v14
a=0;// 
a=0;//     #v14=(DoubleLo);
a=0;//     const-wide/high16 v16, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     mul-double v14, v14, v16
a=0;// 
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);v17=(DoubleHi);
a=0;//     div-double v2, v14, v16
a=0;// 
a=0;//     .line 370
a=0;//     .local v2, "beX":D
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     const-string v14, "SDK_Sample.Util"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "extractThumbNail: extract beX = "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, ", beY = "
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 371
a=0;//     if-eqz p3, :cond_5
a=0;// 
a=0;//     cmpl-double v14, v4, v2
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-lez v14, :cond_4
a=0;// 
a=0;//     move-wide v14, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v14=(DoubleLo);v15=(DoubleHi);
a=0;//     double-to-int v14, v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     iput v14, v11, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 372
a=0;//     iget v14, v11, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     if-gt v14, v15, :cond_1
a=0;// 
a=0;//     .line 373
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     iput v14, v11, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 377
a=0;//     :cond_1
a=0;//     :goto_2
a=0;//     #v14=(Integer);v15=(Integer);
a=0;//     iget v14, v11, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     iget v15, v11, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     mul-int/2addr v14, v15
a=0;// 
a=0;//     iget v15, v11, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     div-int/2addr v14, v15
a=0;// 
a=0;//     const v15, 0x2a3000
a=0;// 
a=0;//     if-gt v14, v15, :cond_7
a=0;// 
a=0;//     .line 381
a=0;//     move/from16 v9, p1
a=0;// 
a=0;//     .line 382
a=0;//     .local v9, "newHeight":I
a=0;//     #v9=(Integer);
a=0;//     move/from16 v10, p2
a=0;// 
a=0;//     .line 383
a=0;//     .local v10, "newWidth":I
a=0;//     #v10=(Integer);
a=0;//     if-eqz p3, :cond_9
a=0;// 
a=0;//     .line 384
a=0;//     cmpl-double v14, v4, v2
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-lez v14, :cond_8
a=0;// 
a=0;//     .line 385
a=0;//     int-to-double v14, v10
a=0;// 
a=0;//     #v14=(DoubleLo);v15=(DoubleHi);
a=0;//     const-wide/high16 v16, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     mul-double v14, v14, v16
a=0;// 
a=0;//     iget v0, v11, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);v17=(DoubleHi);
a=0;//     mul-double v14, v14, v16
a=0;// 
a=0;//     iget v0, v11, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);
a=0;//     div-double v14, v14, v16
a=0;// 
a=0;//     double-to-int v9, v14
a=0;// 
a=0;//     .line 397
a=0;//     :goto_3
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     iput-boolean v14, v11, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 399
a=0;//     const-string v14, "SDK_Sample.Util"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "bitmap required size="
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "x"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, ", orig="
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     iget v0, v11, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "x"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     iget v0, v11, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, ", sample="
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     iget v0, v11, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 400
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v11}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 401
a=0;//     .local v6, "bm":Landroid/graphics/Bitmap;
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v6, :cond_b
a=0;// 
a=0;//     .line 402
a=0;//     const-string v14, "SDK_Sample.Util"
a=0;// 
a=0;//     const-string v15, "bitmap decode failed"
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 403
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 430
a=0;//     .end local v2    # "beX":D
a=0;//     .end local v4    # "beY":D
a=0;//     .end local v6    # "bm":Landroid/graphics/Bitmap;
a=0;//     .end local v9    # "newHeight":I
a=0;//     .end local v10    # "newWidth":I
a=0;//     .end local v13    # "tmp":Landroid/graphics/Bitmap;
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 355
a=0;//     .end local v11    # "options":Landroid/graphics/BitmapFactory$Options;
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .restart local v2    # "beX":D
a=0;//     .restart local v4    # "beY":D
a=0;//     .restart local v11    # "options":Landroid/graphics/BitmapFactory$Options;
a=0;//     .restart local v13    # "tmp":Landroid/graphics/Bitmap;
a=0;//     :cond_4
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);v2=(DoubleLo);v3=(DoubleHi);v4=(DoubleLo);v5=(DoubleHi);v11=(Reference,Landroid/graphics/BitmapFactory$Options;);v13=(Reference,Landroid/graphics/Bitmap;);v14=(Byte);v15=(Reference,Ljava/lang/String;);v16=(Reference,Ljava/lang/String;);v17=(DoubleHi);
a=0;//     move-wide v14, v4
a=0;// 
a=0;//     .line 371
a=0;//     #v14=(DoubleLo);v15=(DoubleHi);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v14=(Reference,Ljava/lang/String;);v15=(Reference,Ljava/lang/String;);
a=0;//     cmpg-double v14, v4, v2
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-gez v14, :cond_6
a=0;// 
a=0;//     move-wide v14, v2
a=0;// 
a=0;//     #v14=(DoubleLo);v15=(DoubleHi);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v14=(Byte);v15=(Reference,Ljava/lang/String;);
a=0;//     move-wide v14, v4
a=0;// 
a=0;//     #v14=(DoubleLo);v15=(DoubleHi);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 378
a=0;//     :cond_7
a=0;//     #v14=(Integer);v15=(Integer);
a=0;//     iget v14, v11, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     add-int/lit8 v14, v14, 0x1
a=0;// 
a=0;//     iput v14, v11, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 425
a=0;//     .end local v2    # "beX":D
a=0;//     .end local v4    # "beY":D
a=0;//     .end local v13    # "tmp":Landroid/graphics/Bitmap;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 426
a=0;//     .local v8, "e":Ljava/lang/OutOfMemoryError;
a=0;//     #v8=(Reference,Ljava/lang/OutOfMemoryError;);
a=0;//     const-string v14, "SDK_Sample.Util"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "decode bitmap failed: "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 427
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 430
a=0;//     #v11=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 387
a=0;//     .end local v8    # "e":Ljava/lang/OutOfMemoryError;
a=0;//     .restart local v2    # "beX":D
a=0;//     .restart local v4    # "beY":D
a=0;//     .restart local v9    # "newHeight":I
a=0;//     .restart local v10    # "newWidth":I
a=0;//     .restart local v13    # "tmp":Landroid/graphics/Bitmap;
a=0;//     :cond_8
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);v2=(DoubleLo);v3=(DoubleHi);v4=(DoubleLo);v5=(DoubleHi);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Integer);v10=(Integer);v11=(Reference,Landroid/graphics/BitmapFactory$Options;);v12=(Uninit);v13=(Reference,Landroid/graphics/Bitmap;);v14=(Byte);v15=(Integer);v17=(DoubleHi);
a=0;//     int-to-double v14, v9
a=0;// 
a=0;//     #v14=(DoubleLo);v15=(DoubleHi);
a=0;//     const-wide/high16 v16, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     mul-double v14, v14, v16
a=0;// 
a=0;//     :try_start_1
a=0;//     iget v0, v11, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);v17=(DoubleHi);
a=0;//     mul-double v14, v14, v16
a=0;// 
a=0;//     iget v0, v11, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);
a=0;//     div-double v14, v14, v16
a=0;// 
a=0;//     double-to-int v10, v14
a=0;// 
a=0;//     .line 389
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 390
a=0;//     :cond_9
a=0;//     #v14=(Integer);v15=(Integer);v16=(Reference,Ljava/lang/String;);
a=0;//     cmpg-double v14, v4, v2
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-gez v14, :cond_a
a=0;// 
a=0;//     .line 391
a=0;//     int-to-double v14, v10
a=0;// 
a=0;//     #v14=(DoubleLo);v15=(DoubleHi);
a=0;//     const-wide/high16 v16, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     mul-double v14, v14, v16
a=0;// 
a=0;//     iget v0, v11, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);v17=(DoubleHi);
a=0;//     mul-double v14, v14, v16
a=0;// 
a=0;//     iget v0, v11, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);
a=0;//     div-double v14, v14, v16
a=0;// 
a=0;//     double-to-int v9, v14
a=0;// 
a=0;//     .line 392
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 393
a=0;//     :cond_a
a=0;//     #v14=(Byte);v15=(Integer);v16=(Reference,Ljava/lang/String;);
a=0;//     int-to-double v14, v9
a=0;// 
a=0;//     #v14=(DoubleLo);v15=(DoubleHi);
a=0;//     const-wide/high16 v16, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v16=(LongLo);v17=(LongHi);
a=0;//     mul-double v14, v14, v16
a=0;// 
a=0;//     iget v0, v11, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);v17=(DoubleHi);
a=0;//     mul-double v14, v14, v16
a=0;// 
a=0;//     iget v0, v11, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);
a=0;//     div-double v14, v14, v16
a=0;// 
a=0;//     double-to-int v10, v14
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 406
a=0;//     .restart local v6    # "bm":Landroid/graphics/Bitmap;
a=0;//     :cond_b
a=0;//     #v0=(Reference,Ljava/lang/String;);v6=(Reference,Landroid/graphics/Bitmap;);v14=(Reference,Ljava/lang/String;);v15=(Reference,Ljava/lang/String;);v16=(Integer);
a=0;//     const-string v14, "SDK_Sample.Util"
a=0;// 
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "bitmap decoded size="
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "x"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 407
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     invoke-static {v6, v10, v9, v14}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 408
a=0;//     .local v12, "scale":Landroid/graphics/Bitmap;
a=0;//     #v12=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v12, :cond_c
a=0;// 
a=0;//     .line 409
a=0;//     invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 410
a=0;//     move-object v6, v12
a=0;// 
a=0;//     .line 413
a=0;//     :cond_c
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     .line 414
a=0;//     invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     sub-int v14, v14, p2
a=0;// 
a=0;//     shr-int/lit8 v14, v14, 0x1
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     sub-int v15, v15, p1
a=0;// 
a=0;//     shr-int/lit8 v15, v15, 0x1
a=0;// 
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v6, v14, v15, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 415
a=0;//     .local v7, "cropped":Landroid/graphics/Bitmap;
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 419
a=0;//     invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 420
a=0;//     move-object v6, v7
a=0;// 
a=0;//     .line 421
a=0;//     const-string v14, "SDK_Sample.Util"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "bitmap croped size="
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "x"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-static {v14, v15}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public static getHtmlByteArray(Ljava/lang/String;)[B
a=0;//     .locals 10
a=0;//     .param p0, "url"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 170
a=0;//     .local v4, "htmlUrl":Ljava/net/URL;
a=0;//     #v4=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 172
a=0;//     .local v7, "inStream":Ljava/io/InputStream;
a=0;//     :try_start_0
a=0;//     #v7=(Null);
a=0;//     new-instance v5, Ljava/net/URL;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v5, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 173
a=0;//     .end local v4    # "htmlUrl":Ljava/net/URL;
a=0;//     .local v5, "htmlUrl":Ljava/net/URL;
a=0;//     :try_start_1
a=0;//     #v5=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 174
a=0;//     .local v1, "connection":Ljava/net/URLConnection;
a=0;//     #v1=(Reference,Ljava/net/URLConnection;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-object v6, v0
a=0;// 
a=0;//     .line 175
a=0;//     .local v6, "httpConnection":Ljava/net/HttpURLConnection;
a=0;//     #v6=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 176
a=0;//     .local v8, "responseCode":I
a=0;//     #v8=(Integer);
a=0;//     const/16 v9, 0xc8
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     if-ne v8, v9, :cond_0
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;//     :try_end_1
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/InputStream;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 184
a=0;//     .end local v1    # "connection":Ljava/net/URLConnection;
a=0;//     .end local v5    # "htmlUrl":Ljava/net/URL;
a=0;//     .end local v6    # "httpConnection":Ljava/net/HttpURLConnection;
a=0;//     .end local v8    # "responseCode":I
a=0;//     .restart local v4    # "htmlUrl":Ljava/net/URL;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/net/URL;);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/utils/StringUtil;->inputStreamToByte(Ljava/io/InputStream;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 186
a=0;//     .local v2, "data":[B
a=0;//     #v2=(Reference,[B);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 179
a=0;//     .end local v2    # "data":[B
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v6=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 180
a=0;//     .local v3, "e":Ljava/net/MalformedURLException;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Ljava/net/MalformedURLException;);v4=(Reference,Ljava/net/URL;);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/net/MalformedURLException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 181
a=0;//     .end local v3    # "e":Ljava/net/MalformedURLException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Null);v6=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 182
a=0;//     .local v3, "e":Ljava/io/IOException;
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Ljava/io/IOException;);v4=(Reference,Ljava/net/URL;);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 181
a=0;//     .end local v3    # "e":Ljava/io/IOException;
a=0;//     .end local v4    # "htmlUrl":Ljava/net/URL;
a=0;//     .restart local v5    # "htmlUrl":Ljava/net/URL;
a=0;//     :catch_2
a=0;//     #v3=(Uninit);v4=(Null);v5=(Reference,Ljava/net/URL;);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "htmlUrl":Ljava/net/URL;
a=0;//     .restart local v4    # "htmlUrl":Ljava/net/URL;
a=0;//     #v4=(Reference,Ljava/net/URL;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 179
a=0;//     .end local v4    # "htmlUrl":Ljava/net/URL;
a=0;//     .restart local v5    # "htmlUrl":Ljava/net/URL;
a=0;//     :catch_3
a=0;//     #v3=(Uninit);v4=(Null);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/MalformedURLException;);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "htmlUrl":Ljava/net/URL;
a=0;//     .restart local v4    # "htmlUrl":Ljava/net/URL;
a=0;//     #v4=(Reference,Ljava/net/URL;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v4    # "htmlUrl":Ljava/net/URL;
a=0;//     .restart local v1    # "connection":Ljava/net/URLConnection;
a=0;//     .restart local v5    # "htmlUrl":Ljava/net/URL;
a=0;//     .restart local v6    # "httpConnection":Ljava/net/HttpURLConnection;
a=0;//     .restart local v8    # "responseCode":I
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);v1=(Reference,Ljava/net/URLConnection;);v3=(Uninit);v4=(Null);v6=(Reference,Ljava/net/HttpURLConnection;);v8=(Integer);v9=(PosShort);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .end local v5    # "htmlUrl":Ljava/net/URL;
a=0;//     .restart local v4    # "htmlUrl":Ljava/net/URL;
a=0;//     #v4=(Reference,Ljava/net/URL;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getbitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 8
a=0;//     .param p0, "imageUri"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 513
a=0;//     const-string v5, "SDK_Sample.Util"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "getbitmap:"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 515
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 517
a=0;//     .local v0, "bitmap":Landroid/graphics/Bitmap;
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v4, Ljava/net/URL;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v4, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 519
a=0;//     .local v4, "myFileUrl":Ljava/net/URL;
a=0;//     #v4=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 518
a=0;//     #v1=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v1, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 520
a=0;//     .local v1, "conn":Ljava/net/HttpURLConnection;
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v1, v5}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 521
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     .line 522
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 523
a=0;//     .local v3, "is":Ljava/io/InputStream;
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 524
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 526
a=0;//     const-string v5, "SDK_Sample.Util"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "image download finished."
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v5, v0
a=0;// 
a=0;//     .line 532
a=0;//     .end local v1    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .end local v3    # "is":Ljava/io/InputStream;
a=0;//     .end local v4    # "myFileUrl":Ljava/net/URL;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 527
a=0;//     :catch_0
a=0;//     #v2=(Uninit);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 528
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 529
a=0;//     const-string v5, "SDK_Sample.Util"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "getbitmap bmp fail---"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 530
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static hexStringToBytes(Ljava/lang/String;)[B
a=0;//     .locals 7
a=0;//     .param p0, "hexString"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 78
a=0;//     :cond_1
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 70
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Boolean);v6=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     div-int/lit8 v3, v5, 0x2
a=0;// 
a=0;//     .line 72
a=0;//     .local v3, "length":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 73
a=0;//     .local v1, "hexChars":[C
a=0;//     #v1=(Reference,[C);
a=0;//     new-array v0, v3, [B
a=0;// 
a=0;//     .line 74
a=0;//     .local v0, "d":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     .line 75
a=0;//     mul-int/lit8 v4, v2, 0x2
a=0;// 
a=0;//     .line 76
a=0;//     .local v4, "pos":I
a=0;//     #v4=(Integer);
a=0;//     aget-char v5, v1, v4
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/utils/StringUtil;->charToByte(C)B
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     shl-int/lit8 v5, v5, 0x4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v6, v4, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget-char v6, v1, v6
a=0;// 
a=0;//     #v6=(Char);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/utils/StringUtil;->charToByte(C)B
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     or-int/2addr v5, v6
a=0;// 
a=0;//     int-to-byte v5, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     aput-byte v5, v0, v2
a=0;// 
a=0;//     .line 74
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static hexToString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     .line 117
a=0;//     #v7=(PosByte);
a=0;//     const-string v5, "0x"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p0, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {p0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 121
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     div-int/lit8 v5, v5, 0x2
a=0;// 
a=0;//     new-array v0, v5, [B
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "baKeyword":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     array-length v5, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lt v3, v5, :cond_1
a=0;// 
a=0;//     .line 136
a=0;//     :try_start_0
a=0;//     new-instance v4, Ljava/lang/String;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v5, "utf-8"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v0, v5}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .end local p0    # "s":Ljava/lang/String;
a=0;//     .local v4, "s":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object p0, v4
a=0;// 
a=0;//     .line 142
a=0;//     .end local v4    # "s":Ljava/lang/String;
a=0;//     .restart local p0    # "s":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 126
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v4=(Uninit);v5=(Integer);
a=0;//     mul-int/lit8 v5, v3, 0x2
a=0;// 
a=0;//     mul-int/lit8 v6, v3, 0x2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, 0x2
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {p0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/16 v6, 0x10
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     and-int/lit16 v5, v5, 0xff
a=0;// 
a=0;//     int-to-byte v5, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     aput-byte v5, v0, v3
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 122
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);v6=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 130
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 138
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 140
a=0;//     .local v2, "e1":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static inputStreamToByte(Ljava/io/InputStream;)[B
a=0;//     .locals 5
a=0;//     .param p0, "is"    # Ljava/io/InputStream;
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 198
a=0;//     .local v0, "bytestream":Ljava/io/ByteArrayOutputStream;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);v1=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->read()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .local v1, "ch":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v1, v4, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 202
a=0;//     .local v3, "imgdata":[B
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 208
a=0;//     .end local v0    # "bytestream":Ljava/io/ByteArrayOutputStream;
a=0;//     .end local v1    # "ch":I
a=0;//     .end local v3    # "imgdata":[B
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 199
a=0;//     .restart local v0    # "bytestream":Ljava/io/ByteArrayOutputStream;
a=0;//     .restart local v1    # "ch":I
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Byte);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 204
a=0;//     .end local v0    # "bytestream":Ljava/io/ByteArrayOutputStream;
a=0;//     .end local v1    # "ch":I
a=0;//     :catch_0
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 205
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 208
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static readBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 7
a=0;//     .param p0, "path"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 340
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     new-instance v3, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "test.jpg"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 341
a=0;//     .local v3, "stream":Ljava/io/FileInputStream;
a=0;//     #v3=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v2, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 342
a=0;//     .local v2, "opts":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v2=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iput v4, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 343
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput-boolean v4, v2, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z
a=0;// 
a=0;//     .line 344
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     iput-boolean v4, v2, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z
a=0;// 
a=0;//     .line 345
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v4, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 349
a=0;//     .end local v2    # "opts":Landroid/graphics/BitmapFactory$Options;
a=0;//     .end local v3    # "stream":Ljava/io/FileInputStream;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 348
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 349
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static readFromFile(Ljava/lang/String;II)[B
a=0;//     .locals 8
a=0;//     .param p0, "fileName"    # Ljava/lang/String;
a=0;//     .param p1, "offset"    # I
a=0;//     .param p2, "len"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 219
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 260
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 223
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 224
a=0;//     .local v2, "file":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 225
a=0;//     const-string v4, "SDK_Sample.Util"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "readFromFile: file not found"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 229
a=0;//     :cond_1
a=0;//     #v4=(Boolean);v5=(Uninit);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne p2, v4, :cond_2
a=0;// 
a=0;//     .line 230
a=0;//     invoke-virtual {v2}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     long-to-int p2, v4
a=0;// 
a=0;//     .line 233
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v4, "SDK_Sample.Util"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "readFromFile : offset = "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, " len = "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, " offset + len = "
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     add-int v6, p1, p2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 235
a=0;//     if-gez p1, :cond_3
a=0;// 
a=0;//     .line 236
a=0;//     const-string v4, "SDK_Sample.Util"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "readFromFile invalid offset:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 239
a=0;//     :cond_3
a=0;//     #v6=(Integer);
a=0;//     if-gtz p2, :cond_4
a=0;// 
a=0;//     .line 240
a=0;//     const-string v4, "SDK_Sample.Util"
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "readFromFile invalid len:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 243
a=0;//     :cond_4
a=0;//     #v6=(Integer);
a=0;//     add-int v4, p1, p2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     long-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-le v4, v5, :cond_5
a=0;// 
a=0;//     .line 244
a=0;//     const-string v4, "SDK_Sample.Util"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "readFromFile invalid file len:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 248
a=0;//     :cond_5
a=0;//     #v4=(Integer);v5=(Integer);v6=(LongHi);v7=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 250
a=0;//     .local v0, "b":[B
a=0;//     :try_start_0
a=0;//     new-instance v3, Ljava/io/RandomAccessFile;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/RandomAccessFile;);
a=0;//     const-string v4, "r"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, p0, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 251
a=0;//     .local v3, "in":Ljava/io/RandomAccessFile;
a=0;//     #v3=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     new-array v0, p2, [B
a=0;// 
a=0;//     .line 252
a=0;//     #v0=(Reference,[B);
a=0;//     int-to-long v4, p1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V
a=0;// 
a=0;//     .line 253
a=0;//     invoke-virtual {v3, v0}, Ljava/io/RandomAccessFile;->readFully([B)V
a=0;// 
a=0;//     .line 254
a=0;//     invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 256
a=0;//     .end local v3    # "in":Ljava/io/RandomAccessFile;
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 257
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v4, "SDK_Sample.Util"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "readFromFile : errMsg = "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final showProgressDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "title"    # Ljava/lang/String;
a=0;//     .param p2, "message"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 444
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/utils/StringUtil;->dismissDialog()V
a=0;// 
a=0;//     .line 445
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 446
a=0;//     const-string p1, "\u8bf7\u7a0d\u5019"
a=0;// 
a=0;//     .line 448
a=0;//     :cond_0
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 449
a=0;//     const-string p2, "\u6b63\u5728\u52a0\u8f7d..."
a=0;// 
a=0;//     .line 451
a=0;//     :cond_1
a=0;//     invoke-static {p0, p1, p2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     sput-object v0, Lcom/twocloo/com/cn/utils/StringUtil;->mProgressDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 452
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final showResultDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 440
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 436
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\n"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 437
a=0;//     .local v0, "rmsg":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Util"
a=0;// 
a=0;//     invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 438
a=0;//     new-instance v1, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v1, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 439
a=0;//     const-string v2, "\u786e\u5b9a"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static toHexString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 104
a=0;//     .local v0, "bytes":[B
a=0;//     #v0=(Reference,[B);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 106
a=0;//     .local v2, "sb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     if-lt v1, v3, :cond_0
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     #v3=(Integer);
a=0;//     sget-object v3, Lcom/twocloo/com/cn/utils/StringUtil;->hexString:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aget-byte v4, v0, v1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     and-int/lit16 v4, v4, 0xf0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shr-int/lit8 v4, v4, 0x4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 109
a=0;//     sget-object v3, Lcom/twocloo/com/cn/utils/StringUtil;->hexString:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aget-byte v4, v0, v1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     and-int/lit8 v4, v4, 0xf
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shr-int/lit8 v4, v4, 0x0
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 106
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final toastMessage(Landroid/app/Activity;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;//     .param p1, "message"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0}, Lcom/twocloo/com/cn/utils/StringUtil;->toastMessage(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 503
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final toastMessage(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p0, "activity"    # Landroid/app/Activity;
a=0;//     .param p1, "message"    # Ljava/lang/String;
a=0;//     .param p2, "logLevel"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     const-string v0, "w"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 472
a=0;//     const-string v0, "sdkDemo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 478
a=0;//     :goto_0
a=0;//     new-instance v0, Lcom/twocloo/com/cn/utils/StringUtil$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/utils/StringUtil$1;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/twocloo/com/cn/utils/StringUtil$1;-><init>(Landroid/app/Activity;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/utils/StringUtil$1;);
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 490
a=0;//     return-void
a=0;// 
a=0;//     .line 473
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "e"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 474
a=0;//     const-string v0, "sdkDemo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 476
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "sdkDemo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
