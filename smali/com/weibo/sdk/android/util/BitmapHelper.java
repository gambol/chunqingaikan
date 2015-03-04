package com.weibo.sdk.android.util; class BitmapHelper { void a() { int a;
a=0;// .class public final Lcom/weibo/sdk/android/util/BitmapHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BitmapHelper.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/util/BitmapHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getSampleSizeAutoFitToScreen(IIII)I
a=0;//     .locals 4
a=0;//     .param p0, "vWidth"    # I
a=0;//     .param p1, "vHeight"    # I
a=0;//     .param p2, "bWidth"    # I
a=0;//     .param p3, "bHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 54
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 50
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     div-int v2, p2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-int v3, p3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "ratio":I
a=0;//     #v0=(Integer);
a=0;//     div-int v2, p3, p0
a=0;// 
a=0;//     div-int v3, p2, p1
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "ratioAfterRotate":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getSampleSizeOfNotTooLarge(Landroid/graphics/Rect;)I
a=0;//     .locals 7
a=0;//     .param p0, "rect"    # Landroid/graphics/Rect;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const/high16 v0, 0x500000
a=0;// 
a=0;//     .line 32
a=0;//     .local v0, "FIVE_M":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Rect;->width()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Rect;->height()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-double v5, v5
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     mul-double/2addr v3, v5
a=0;// 
a=0;//     const-wide/high16 v5, 0x4000000000000000L    # 2.0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     mul-double/2addr v3, v5
a=0;// 
a=0;//     const-wide/high16 v5, 0x4154000000000000L    # 5242880.0
a=0;// 
a=0;//     div-double v1, v3, v5
a=0;// 
a=0;//     .line 33
a=0;//     .local v1, "ratio":D
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     const-wide/high16 v3, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmpl-double v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ltz v3, :cond_0
a=0;// 
a=0;//     double-to-int v3, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Integer);
a=0;//     return v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Byte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static makesureSizeNotTooLarge(Landroid/graphics/Rect;)Z
a=0;//     .locals 3
a=0;//     .param p0, "rect"    # Landroid/graphics/Rect;
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     const/high16 v0, 0x500000
a=0;// 
a=0;//     .line 23
a=0;//     .local v0, "FIVE_M":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Rect;->width()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Rect;->height()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/2addr v1, v2
a=0;// 
a=0;//     mul-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     const/high16 v2, 0x500000
a=0;// 
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     .line 25
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 27
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static verifyBitmap(Ljava/io/InputStream;)Z
a=0;//     .locals 5
a=0;//     .param p0, "input"    # Ljava/io/InputStream;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     #v3=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 88
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v1, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 78
a=0;//     .local v1, "options":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v1=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     iput-boolean v4, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 79
a=0;//     instance-of v2, p0, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 81
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0, v2, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 83
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 88
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);
a=0;//     iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 80
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Boolean);
a=0;//     new-instance v2, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     invoke-direct {v2, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     move-object p0, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 84
a=0;//     :catch_0
a=0;//     #v2=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 86
a=0;//     .local v0, "e":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local v0    # "e":Ljava/io/IOException;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 88
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static verifyBitmap(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;//     .param p0, "path"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v1}, Lcom/weibo/sdk/android/util/BitmapHelper;->verifyBitmap(Ljava/io/InputStream;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 103
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 100
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 101
a=0;//     .local v0, "e":Ljava/io/FileNotFoundException;
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     .line 103
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static verifyBitmap([B)Z
a=0;//     .locals 1
a=0;//     .param p0, "datas"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-static {v0}, Lcom/weibo/sdk/android/util/BitmapHelper;->verifyBitmap(Ljava/io/InputStream;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
