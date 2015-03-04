package com.android.volley.toolbox; class ImageRequest { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/ImageRequest;
a=0;// .super Lcom/android/volley/Request;
a=0;// .source "ImageRequest.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Lcom/android/volley/Request",
a=0;//         "<",
a=0;//         "Landroid/graphics/Bitmap;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final IMAGE_BACKOFF_MULT:F = 2.0f
a=0;// 
a=0;// .field private static final IMAGE_MAX_RETRIES:I = 0x2
a=0;// 
a=0;// .field private static final IMAGE_TIMEOUT_MS:I = 0x3e8
a=0;// 
a=0;// .field private static final sDecodeLock:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mDecodeConfig:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;// .field private final mListener:Lcom/android/volley/Response$Listener;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/android/volley/Response$Listener",
a=0;//             "<",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mMaxHeight:I
a=0;// 
a=0;// .field private final mMaxWidth:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Lcom/android/volley/toolbox/ImageRequest;->sDecodeLock:Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Lcom/android/volley/Response$Listener;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/Response$ErrorListener;)V
a=0;//     .locals 4
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p3, "maxWidth"    # I
a=0;//     .param p4, "maxHeight"    # I
a=0;//     .param p5, "decodeConfig"    # Landroid/graphics/Bitmap$Config;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/android/volley/Response$Listener",
a=0;//             "<",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;II",
a=0;//             "Landroid/graphics/Bitmap$Config;",
a=0;//             "Lcom/android/volley/Response$ErrorListener;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     .local p2, "listener":Lcom/android/volley/Response$Listener;, "Lcom/android/volley/Response$Listener<Landroid/graphics/Bitmap;>;"
a=0;//     .local p6, "errorListener":Lcom/android/volley/Response$ErrorListener;, "Lcom/android/volley/Response$ErrorListener;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0, p1, p6}, Lcom/android/volley/Request;-><init>(ILjava/lang/String;Lcom/android/volley/Response$ErrorListener;)V
a=0;// 
a=0;//     .line 73
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/ImageRequest;);
a=0;//     new-instance v0, Lcom/android/volley/DefaultRetryPolicy;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/android/volley/DefaultRetryPolicy;);
a=0;//     const/16 v1, 0x3e8
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/high16 v3, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v0, v1, v2, v3}, Lcom/android/volley/DefaultRetryPolicy;-><init>(IIF)V
a=0;// 
a=0;//     .line 72
a=0;//     #v0=(Reference,Lcom/android/volley/DefaultRetryPolicy;);
a=0;//     invoke-virtual {p0, v0}, Lcom/android/volley/toolbox/ImageRequest;->setRetryPolicy(Lcom/android/volley/RetryPolicy;)V
a=0;// 
a=0;//     .line 74
a=0;//     iput-object p2, p0, Lcom/android/volley/toolbox/ImageRequest;->mListener:Lcom/android/volley/Response$Listener;
a=0;// 
a=0;//     .line 75
a=0;//     iput-object p5, p0, Lcom/android/volley/toolbox/ImageRequest;->mDecodeConfig:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 76
a=0;//     iput p3, p0, Lcom/android/volley/toolbox/ImageRequest;->mMaxWidth:I
a=0;// 
a=0;//     .line 77
a=0;//     iput p4, p0, Lcom/android/volley/toolbox/ImageRequest;->mMaxHeight:I
a=0;// 
a=0;//     .line 78
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private doParse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
a=0;//     .locals 12
a=0;//     .param p1, "response"    # Lcom/android/volley/NetworkResponse;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/NetworkResponse;",
a=0;//             ")",
a=0;//             "Lcom/android/volley/Response",
a=0;//             "<",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 138
a=0;//     #v10=(Null);
a=0;//     iget-object v3, p1, Lcom/android/volley/NetworkResponse;->data:[B
a=0;// 
a=0;//     .line 139
a=0;//     .local v3, "data":[B
a=0;//     #v3=(Reference,[B);
a=0;//     new-instance v4, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 140
a=0;//     .local v4, "decodeOptions":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v4=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 141
a=0;//     .local v2, "bitmap":Landroid/graphics/Bitmap;
a=0;//     #v2=(Null);
a=0;//     iget v8, p0, Lcom/android/volley/toolbox/ImageRequest;->mMaxWidth:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     iget v8, p0, Lcom/android/volley/toolbox/ImageRequest;->mMaxHeight:I
a=0;// 
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v8, p0, Lcom/android/volley/toolbox/ImageRequest;->mDecodeConfig:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     iput-object v8, v4, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 143
a=0;//     array-length v8, v3
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v3, v10, v8, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 177
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/graphics/Bitmap;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 178
a=0;//     new-instance v8, Lcom/android/volley/ParseError;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/android/volley/ParseError;);
a=0;//     invoke-direct {v8, p1}, Lcom/android/volley/ParseError;-><init>(Lcom/android/volley/NetworkResponse;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/android/volley/ParseError;);
a=0;//     invoke-static {v8}, Lcom/android/volley/Response;->error(Lcom/android/volley/VolleyError;)Lcom/android/volley/Response;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 180
a=0;//     :goto_1
a=0;//     return-object v8
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Integer);v9=(Uninit);
a=0;//     iput-boolean v11, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 147
a=0;//     array-length v8, v3
a=0;// 
a=0;//     invoke-static {v3, v10, v8, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 148
a=0;//     iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     .line 149
a=0;//     .local v1, "actualWidth":I
a=0;//     #v1=(Integer);
a=0;//     iget v0, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     .line 152
a=0;//     .local v0, "actualHeight":I
a=0;//     #v0=(Integer);
a=0;//     iget v8, p0, Lcom/android/volley/toolbox/ImageRequest;->mMaxWidth:I
a=0;// 
a=0;//     iget v9, p0, Lcom/android/volley/toolbox/ImageRequest;->mMaxHeight:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v8, v9, v1, v0}, Lcom/android/volley/toolbox/ImageRequest;->getResizedDimension(IIII)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 154
a=0;//     .local v6, "desiredWidth":I
a=0;//     #v6=(Integer);
a=0;//     iget v8, p0, Lcom/android/volley/toolbox/ImageRequest;->mMaxHeight:I
a=0;// 
a=0;//     iget v9, p0, Lcom/android/volley/toolbox/ImageRequest;->mMaxWidth:I
a=0;// 
a=0;//     invoke-static {v8, v9, v0, v1}, Lcom/android/volley/toolbox/ImageRequest;->getResizedDimension(IIII)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 158
a=0;//     .local v5, "desiredHeight":I
a=0;//     #v5=(Integer);
a=0;//     iput-boolean v10, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 162
a=0;//     invoke-static {v1, v0, v6, v5}, Lcom/android/volley/toolbox/ImageRequest;->findBestSampleSize(IIII)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 161
a=0;//     iput v8, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 164
a=0;//     array-length v8, v3
a=0;// 
a=0;//     invoke-static {v3, v10, v8, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 167
a=0;//     .local v7, "tempBitmap":Landroid/graphics/Bitmap;
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-gt v8, v6, :cond_1
a=0;// 
a=0;//     .line 168
a=0;//     invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     if-le v8, v5, :cond_2
a=0;// 
a=0;//     .line 169
a=0;//     :cond_1
a=0;//     invoke-static {v7, v6, v5, v11}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 171
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 173
a=0;//     :cond_2
a=0;//     #v2=(Null);
a=0;//     move-object v2, v7
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 180
a=0;//     .end local v0    # "actualHeight":I
a=0;//     .end local v1    # "actualWidth":I
a=0;//     .end local v5    # "desiredHeight":I
a=0;//     .end local v6    # "desiredWidth":I
a=0;//     .end local v7    # "tempBitmap":Landroid/graphics/Bitmap;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     invoke-static {p1}, Lcom/android/volley/toolbox/HttpHeaderParser;->parseCacheHeaders(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Cache$Entry;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcom/android/volley/Cache$Entry;);
a=0;//     invoke-static {v2, v8}, Lcom/android/volley/Response;->success(Ljava/lang/Object;Lcom/android/volley/Cache$Entry;)Lcom/android/volley/Response;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static findBestSampleSize(IIII)I
a=0;//     .locals 12
a=0;//     .param p0, "actualWidth"    # I
a=0;//     .param p1, "actualHeight"    # I
a=0;//     .param p2, "desiredWidth"    # I
a=0;//     .param p3, "desiredHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v11, 0x40000000    # 2.0f
a=0;// 
a=0;//     .line 201
a=0;//     #v11=(Integer);
a=0;//     int-to-double v7, p0
a=0;// 
a=0;//     #v7=(DoubleLo);v8=(DoubleHi);
a=0;//     int-to-double v9, p2
a=0;// 
a=0;//     #v9=(DoubleLo);v10=(DoubleHi);
a=0;//     div-double v5, v7, v9
a=0;// 
a=0;//     .line 202
a=0;//     .local v5, "wr":D
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     int-to-double v7, p1
a=0;// 
a=0;//     int-to-double v9, p3
a=0;// 
a=0;//     div-double v0, v7, v9
a=0;// 
a=0;//     .line 203
a=0;//     .local v0, "hr":D
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->min(DD)D
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 204
a=0;//     .local v3, "ratio":D
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 205
a=0;//     .local v2, "n":F
a=0;//     :goto_0
a=0;//     #v2=(Integer);v7=(Conflicted);
a=0;//     mul-float v7, v2, v11
a=0;// 
a=0;//     #v7=(Float);
a=0;//     float-to-double v7, v7
a=0;// 
a=0;//     #v7=(DoubleLo);
a=0;//     cmpg-double v7, v7, v3
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_0
a=0;// 
a=0;//     .line 209
a=0;//     float-to-int v7, v2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     return v7
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     #v7=(Byte);
a=0;//     mul-float/2addr v2, v11
a=0;// 
a=0;//     #v2=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static getResizedDimension(IIII)I
a=0;//     .locals 7
a=0;//     .param p0, "maxPrimary"    # I
a=0;//     .param p1, "maxSecondary"    # I
a=0;//     .param p2, "actualPrimary"    # I
a=0;//     .param p3, "actualSecondary"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     .end local p2    # "actualPrimary":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return p2
a=0;// 
a=0;//     .line 104
a=0;//     .restart local p2    # "actualPrimary":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 105
a=0;//     int-to-double v3, p1
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     int-to-double v5, p3
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     div-double v0, v3, v5
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "ratio":D
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     int-to-double v3, p2
a=0;// 
a=0;//     mul-double/2addr v3, v0
a=0;// 
a=0;//     double-to-int p2, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     .end local v0    # "ratio":D
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     if-nez p1, :cond_2
a=0;// 
a=0;//     move p2, p0
a=0;// 
a=0;//     .line 110
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :cond_2
a=0;//     int-to-double v3, p3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     int-to-double v5, p2
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     div-double v0, v3, v5
a=0;// 
a=0;//     .line 114
a=0;//     .restart local v0    # "ratio":D
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     move v2, p0
a=0;// 
a=0;//     .line 115
a=0;//     .local v2, "resized":I
a=0;//     #v2=(Integer);
a=0;//     int-to-double v3, v2
a=0;// 
a=0;//     mul-double/2addr v3, v0
a=0;// 
a=0;//     int-to-double v5, p1
a=0;// 
a=0;//     cmpl-double v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_3
a=0;// 
a=0;//     .line 116
a=0;//     int-to-double v3, p1
a=0;// 
a=0;//     #v3=(DoubleLo);
a=0;//     div-double/2addr v3, v0
a=0;// 
a=0;//     double-to-int v2, v3
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     move p2, v2
a=0;// 
a=0;//     .line 118
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected deliverResponse(Landroid/graphics/Bitmap;)V
a=0;//     .locals 1
a=0;//     .param p1, "response"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     iget-object v0, p0, Lcom/android/volley/toolbox/ImageRequest;->mListener:Lcom/android/volley/Response$Listener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Response$Listener;);
a=0;//     invoke-interface {v0, p1}, Lcom/android/volley/Response$Listener;->onResponse(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 187
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic deliverResponse(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/android/volley/toolbox/ImageRequest;->deliverResponse(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getPriority()Lcom/android/volley/Request$Priority;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     sget-object v0, Lcom/android/volley/Request$Priority;->LOW:Lcom/android/volley/Request$Priority;
a=0;// 
a=0;//     #v0=(Reference,Lcom/android/volley/Request$Priority;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected parseNetworkResponse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
a=0;//     .locals 6
a=0;//     .param p1, "response"    # Lcom/android/volley/NetworkResponse;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/NetworkResponse;",
a=0;//             ")",
a=0;//             "Lcom/android/volley/Response",
a=0;//             "<",
a=0;//             "Landroid/graphics/Bitmap;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     sget-object v2, Lcom/android/volley/toolbox/ImageRequest;->sDecodeLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 126
a=0;//     :try_start_0
a=0;//     invoke-direct {p0, p1}, Lcom/android/volley/toolbox/ImageRequest;->doParse(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Lcom/android/volley/Response;);
a=0;//     monitor-exit v2
a=0;// 
a=0;//     .line 129
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 127
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 128
a=0;//     .local v0, "e":Ljava/lang/OutOfMemoryError;
a=0;//     #v0=(Reference,Ljava/lang/OutOfMemoryError;);
a=0;//     const-string v1, "Caught OOM for %d byte image, url=%s"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p1, Lcom/android/volley/NetworkResponse;->data:[B
a=0;// 
a=0;//     #v5=(Reference,[B);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/toolbox/ImageRequest;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v1, v3}, Lcom/android/volley/VolleyLog;->e(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 129
a=0;//     new-instance v1, Lcom/android/volley/ParseError;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/android/volley/ParseError;);
a=0;//     invoke-direct {v1, v0}, Lcom/android/volley/ParseError;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/android/volley/ParseError;);
a=0;//     invoke-static {v1}, Lcom/android/volley/Response;->error(Lcom/android/volley/VolleyError;)Lcom/android/volley/Response;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     monitor-exit v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 124
a=0;//     .end local v0    # "e":Ljava/lang/OutOfMemoryError;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v2
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
}}
