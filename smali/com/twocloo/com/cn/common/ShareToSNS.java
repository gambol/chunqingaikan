package com.twocloo.com.cn.common; class ShareToSNS { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/common/ShareToSNS;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ShareToSNS.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final PINPAI:Ljava/lang/String; = "\u4e8c\u5c42\u697c\u4e66\u9662"
a=0;// 
a=0;// .field private static final SHARE_WEXIN_CODE:I = 0x2710
a=0;// 
a=0;// .field private static final TIMELINE_SUPPORTED_VERSION:I = 0x21020001
a=0;// 
a=0;// .field public static aid:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private booklogo:Ljava/lang/String;
a=0;// 
a=0;// .field private bookname:Ljava/lang/String;
a=0;// 
a=0;// .field private content:Ljava/lang/String;
a=0;// 
a=0;// .field private context:Landroid/content/Context;
a=0;// 
a=0;// .field private description:Ljava/lang/String;
a=0;// 
a=0;// .field private filePath:Ljava/lang/String;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field public shareMode:I
a=0;// 
a=0;// .field private sortname:Ljava/lang/String;
a=0;// 
a=0;// .field private thumb:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field public wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "mAid"    # Ljava/lang/String;
a=0;//     .param p3, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 106
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->bookname:Ljava/lang/String;
a=0;// 
a=0;//     .line 49
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->booklogo:Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->description:Ljava/lang/String;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->sortname:Ljava/lang/String;
a=0;// 
a=0;//     .line 53
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->thumb:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Lcom/twocloo/com/cn/common/ShareToSNS$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/common/ShareToSNS$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/common/ShareToSNS$1;-><init>(Lcom/twocloo/com/cn/common/ShareToSNS;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 107
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->context:Landroid/content/Context;
a=0;// 
a=0;//     .line 108
a=0;//     iput-object p3, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 109
a=0;//     sput-object p2, Lcom/twocloo/com/cn/common/ShareToSNS;->aid:Ljava/lang/String;
a=0;// 
a=0;//     .line 112
a=0;//     const-string v0, "wx2819d944f57342c2"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcom/tencent/mm/sdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/common/ShareToSNS;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->description:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/common/ShareToSNS;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->sortname:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/common/ShareToSNS;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->booklogo:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/common/ShareToSNS;Landroid/graphics/Bitmap;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->thumb:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/common/ShareToSNS;)Landroid/graphics/Bitmap;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->thumb:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/common/ShareToSNS;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->bookname:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/common/ShareToSNS;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->sortname:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/common/ShareToSNS;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->description:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/common/ShareToSNS;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/common/ShareToSNS;->buildTransaction(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/common/ShareToSNS;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/common/ShareToSNS;->isSupportedTimeline()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/common/ShareToSNS;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->bookname:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/common/ShareToSNS;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->booklogo:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private buildTransaction(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p1, "type"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static getBitmapBytes(Landroid/graphics/Bitmap;Z)[B
a=0;//     .locals 10
a=0;//     .param p0, "bitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "paramBoolean"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v9, 0x78
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 463
a=0;//     #v8=(Null);
a=0;//     sget-object v5, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v9, v9, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 464
a=0;//     .local v2, "localBitmap":Landroid/graphics/Bitmap;
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v4, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v4, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 466
a=0;//     .local v4, "localCanvas":Landroid/graphics/Canvas;
a=0;//     #v4=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-le v5, v6, :cond_1
a=0;// 
a=0;//     .line 467
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 472
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     new-instance v5, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v5, v8, v8, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Rect;);
a=0;//     new-instance v6, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v6, v8, v8, v9, v9}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Rect;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, p0, v5, v6, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 473
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 474
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 475
a=0;//     :cond_0
a=0;//     new-instance v3, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 476
a=0;//     .local v3, "localByteArrayOutputStream":Ljava/io/ByteArrayOutputStream;
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v6, 0x64
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v5, v6, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 477
a=0;//     invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 478
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 480
a=0;//     .local v0, "arrayOfByte":[B
a=0;//     :try_start_0
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 481
a=0;//     return-object v0
a=0;// 
a=0;//     .line 469
a=0;//     .end local v0    # "arrayOfByte":[B
a=0;//     .end local v1    # "i":I
a=0;//     .end local v3    # "localByteArrayOutputStream":Ljava/io/ByteArrayOutputStream;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v5=(Integer);v6=(Integer);v7=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .restart local v1    # "i":I
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 482
a=0;//     .restart local v0    # "arrayOfByte":[B
a=0;//     .restart local v3    # "localByteArrayOutputStream":Ljava/io/ByteArrayOutputStream;
a=0;//     :catch_0
a=0;//     #v0=(Reference,[B);v3=(Reference,Ljava/io/ByteArrayOutputStream;);v5=(Reference,Landroid/graphics/Bitmap$CompressFormat;);v6=(PosByte);v7=(Null);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 485
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 471
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getShareToWechatBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 5
a=0;//     .param p1, "filePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 432
a=0;//     new-instance v2, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 433
a=0;//     .local v2, "opts":Landroid/graphics/BitmapFactory$Options;
a=0;//     #v2=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 434
a=0;//     .local v0, "bitmap":Landroid/graphics/Bitmap;
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 435
a=0;//     invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 436
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 437
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->welcome:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 450
a=0;//     .end local v0    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     .local v1, "bitmap":Landroid/graphics/Bitmap;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 442
a=0;//     .end local v1    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     .restart local v0    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Uninit);v3=(Boolean);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$drawable;->welcome:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 450
a=0;//     .end local v0    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     .restart local v1    # "bitmap":Landroid/graphics/Bitmap;
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isSupportedTimeline()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 293
a=0;//     #v1=(One);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/mm/sdk/openapi/IWXAPI;);
a=0;//     invoke-interface {v2}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->getWXAppSupportAPI()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 294
a=0;//     .local v0, "wxSdkVersion":I
a=0;//     #v0=(Integer);
a=0;//     const v2, 0x21020001
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     .line 298
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 297
a=0;//     :cond_0
a=0;//     #v1=(One);v2=(Integer);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "wxSdkVersion = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\n\u4e0d\u652f\u6301\u53d1\u9001\u5230\u670b\u53cb\u5708"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 298
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bmpToByteArray(Landroid/graphics/Bitmap;Z)[B
a=0;//     .locals 5
a=0;//     .param p1, "bmp"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "needRecycle"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 314
a=0;//     .local v1, "output":Ljava/io/ByteArrayOutputStream;
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v4, 0x64
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p1, v3, v4, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     .line 315
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 316
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 318
a=0;//     :cond_0
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 320
a=0;//     .local v2, "result":[B
a=0;//     :try_start_0
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 325
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 321
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 322
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sendToWeixin(Ljava/lang/String;Landroid/graphics/Bitmap;)V
a=0;//     .locals 8
a=0;//     .param p1, "text"    # Ljava/lang/String;
a=0;//     .param p2, "bitmap"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 382
a=0;//     #v7=(One);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     const-string v5, "wx2819d944f57342c2"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v4, v5, v6}, Lcom/tencent/mm/sdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     .line 384
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     const-string v5, "wx2819d944f57342c2"
a=0;// 
a=0;//     invoke-interface {v4, v5}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 385
a=0;//     new-instance v2, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;);
a=0;//     invoke-direct {v2}, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;-><init>()V
a=0;// 
a=0;//     .line 386
a=0;//     .local v2, "req":Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;
a=0;//     #v2=(Reference,Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;);
a=0;//     new-instance v1, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     .line 396
a=0;//     .local v1, "msg":Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 398
a=0;//     new-instance v3, Lcom/tencent/mm/sdk/modelmsg/WXTextObject;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/WXTextObject;);
a=0;//     invoke-direct {v3}, Lcom/tencent/mm/sdk/modelmsg/WXTextObject;-><init>()V
a=0;// 
a=0;//     .line 399
a=0;//     .local v3, "textObj":Lcom/tencent/mm/sdk/modelmsg/WXTextObject;
a=0;//     #v3=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXTextObject;);
a=0;//     iput-object p1, v3, Lcom/tencent/mm/sdk/modelmsg/WXTextObject;->text:Ljava/lang/String;
a=0;// 
a=0;//     .line 401
a=0;//     iput-object v3, v1, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     .line 402
a=0;//     const-string v4, "text"
a=0;// 
a=0;//     invoke-direct {p0, v4}, Lcom/twocloo/com/cn/common/ShareToSNS;->buildTransaction(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v2, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->transaction:Ljava/lang/String;
a=0;// 
a=0;//     .line 411
a=0;//     .end local v3    # "textObj":Lcom/tencent/mm/sdk/modelmsg/WXTextObject;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iput-object p1, v1, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     .line 412
a=0;//     iput-object p1, v1, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     .line 413
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 415
a=0;//     invoke-virtual {p0, p2, v7}, Lcom/twocloo/com/cn/common/ShareToSNS;->bmpToByteArray(Landroid/graphics/Bitmap;Z)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v1, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     .line 417
a=0;//     :cond_0
a=0;//     iput-object v1, v2, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     .line 418
a=0;//     iput v7, v2, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     .line 420
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     invoke-interface {v4, v2}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/sdk/modelbase/BaseReq;)Z
a=0;// 
a=0;//     .line 421
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     invoke-interface {v4}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->unregisterApp()V
a=0;// 
a=0;//     .line 422
a=0;//     return-void
a=0;// 
a=0;//     .line 406
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Uninit);
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/WXImageObject;);
a=0;//     invoke-direct {v0, p2}, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 407
a=0;//     .local v0, "imgObject":Lcom/tencent/mm/sdk/modelmsg/WXImageObject;
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXImageObject;);
a=0;//     iput-object v0, v1, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     .line 408
a=0;//     const-string v4, "img"
a=0;// 
a=0;//     invoke-direct {p0, v4}, Lcom/twocloo/com/cn/common/ShareToSNS;->buildTransaction(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, v2, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->transaction:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public sendToWeixin(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 9
a=0;//     .param p1, "text"    # Ljava/lang/String;
a=0;//     .param p2, "filePath"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 337
a=0;//     #v8=(One);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     const-string v6, "wx2819d944f57342c2"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v5, v6, v7}, Lcom/tencent/mm/sdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     .line 339
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     const-string v6, "wx2819d944f57342c2"
a=0;// 
a=0;//     invoke-interface {v5, v6}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 340
a=0;//     new-instance v3, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;);
a=0;//     invoke-direct {v3}, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;-><init>()V
a=0;// 
a=0;//     .line 341
a=0;//     .local v3, "req":Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;
a=0;//     #v3=(Reference,Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;);
a=0;//     new-instance v2, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     invoke-direct {v2}, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     .line 343
a=0;//     .local v2, "msg":Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;//     #v2=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;);
a=0;//     invoke-direct {p0, p2}, Lcom/twocloo/com/cn/common/ShareToSNS;->getShareToWechatBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 345
a=0;//     .local v0, "bitmap":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 347
a=0;//     new-instance v4, Lcom/tencent/mm/sdk/modelmsg/WXTextObject;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/WXTextObject;);
a=0;//     invoke-direct {v4}, Lcom/tencent/mm/sdk/modelmsg/WXTextObject;-><init>()V
a=0;// 
a=0;//     .line 348
a=0;//     .local v4, "textObj":Lcom/tencent/mm/sdk/modelmsg/WXTextObject;
a=0;//     #v4=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXTextObject;);
a=0;//     iput-object p1, v4, Lcom/tencent/mm/sdk/modelmsg/WXTextObject;->text:Ljava/lang/String;
a=0;// 
a=0;//     .line 350
a=0;//     iput-object v4, v2, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     .line 351
a=0;//     const-string v5, "text"
a=0;// 
a=0;//     invoke-direct {p0, v5}, Lcom/twocloo/com/cn/common/ShareToSNS;->buildTransaction(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, v3, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->transaction:Ljava/lang/String;
a=0;// 
a=0;//     .line 360
a=0;//     .end local v4    # "textObj":Lcom/tencent/mm/sdk/modelmsg/WXTextObject;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     iput-object p1, v2, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     .line 361
a=0;//     iput-object p1, v2, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     .line 362
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 364
a=0;//     invoke-virtual {p0, v0, v8}, Lcom/twocloo/com/cn/common/ShareToSNS;->bmpToByteArray(Landroid/graphics/Bitmap;Z)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, v2, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     .line 366
a=0;//     :cond_0
a=0;//     iput-object v2, v3, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;
a=0;// 
a=0;//     .line 367
a=0;//     iput v8, v3, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->scene:I
a=0;// 
a=0;//     .line 369
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->wxApi:Lcom/tencent/mm/sdk/openapi/IWXAPI;
a=0;// 
a=0;//     invoke-interface {v5, v3}, Lcom/tencent/mm/sdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/sdk/modelbase/BaseReq;)Z
a=0;// 
a=0;//     .line 371
a=0;//     return-void
a=0;// 
a=0;//     .line 355
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v4=(Uninit);
a=0;//     new-instance v1, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/WXImageObject;);
a=0;//     invoke-direct {v1, v0}, Lcom/tencent/mm/sdk/modelmsg/WXImageObject;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 356
a=0;//     .local v1, "imgObject":Lcom/tencent/mm/sdk/modelmsg/WXImageObject;
a=0;//     #v1=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXImageObject;);
a=0;//     iput-object v1, v2, Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/sdk/modelmsg/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     .line 357
a=0;//     const-string v5, "img"
a=0;// 
a=0;//     invoke-direct {p0, v5}, Lcom/twocloo/com/cn/common/ShareToSNS;->buildTransaction(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, v3, Lcom/tencent/mm/sdk/modelmsg/SendMessageToWX$Req;->transaction:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public shareWeixin(I)V
a=0;//     .locals 2
a=0;//     .param p1, "flag"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 259
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->shareMode:I
a=0;// 
a=0;//     .line 260
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->context:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/common/ShareToSNS;->pd:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 261
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/common/ShareToSNS$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/common/ShareToSNS$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/common/ShareToSNS$2;-><init>(Lcom/twocloo/com/cn/common/ShareToSNS;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/ShareToSNS$2;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 284
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 285
a=0;//     return-void
a=0;// .end method
}}
