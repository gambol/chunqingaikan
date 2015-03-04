package cn.sharesdk.wechat.utils; class WechatHelper { void a() { int a;
a=0;// .class public Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/sharesdk/wechat/utils/WechatHelper$ShareParams;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Z
a=0;// 
a=0;// .field private static b:Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private c:Lcn/sharesdk/wechat/utils/j;
a=0;// 
a=0;// .field private d:Lcn/sharesdk/wechat/utils/k;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcn/sharesdk/wechat/utils/WechatHelper;->a:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/j;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/j;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/j;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/wechat/utils/WechatHelper;->c:Lcn/sharesdk/wechat/utils/j;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;)I
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p1, p2, v1, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/graphics/BitmapFactory$Options;II)I
a=0;//     .locals 4
a=0;// 
a=0;//     iget v1, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     div-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     div-int v3, v2, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gt v3, p1, :cond_0
a=0;// 
a=0;//     div-int v3, v1, v0
a=0;// 
a=0;//     if-le v3, p2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     add-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gt v3, p2, :cond_0
a=0;// 
a=0;//     if-gt v2, p2, :cond_0
a=0;// 
a=0;//     const-wide/high16 v0, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);v4=(Conflicted);v5=(Conflicted);
a=0;//     int-to-double v4, v2
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     mul-double/2addr v4, v0
a=0;// 
a=0;//     double-to-int v2, v4
a=0;// 
a=0;//     int-to-double v3, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     mul-double/2addr v0, v3
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {p1, v2, v0, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Integer);v4=(Uninit);v5=(Uninit);
a=0;//     if-le v3, v2, :cond_1
a=0;// 
a=0;//     int-to-double v0, p2
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     int-to-double v4, v3
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     div-double/2addr v0, v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     int-to-double v0, p2
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     int-to-double v4, v2
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     div-double/2addr v0, v4
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/wechat/utils/WechatHelper;->b:Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WechatHelper;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     sput-object v0, Lcn/sharesdk/wechat/utils/WechatHelper;->b:Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/sharesdk/wechat/utils/WechatHelper;->b:Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a([B)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const-string v0, "BM"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "GIF"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-array v2, v6, [B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     fill-array-data v2, :array_0
a=0;// 
a=0;//     new-array v3, v4, [B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     fill-array-data v3, :array_1
a=0;// 
a=0;//     new-array v4, v4, [B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     fill-array-data v4, :array_2
a=0;// 
a=0;//     new-array v5, v6, [B
a=0;// 
a=0;//     #v5=(Reference,[B);
a=0;//     fill-array-data v5, :array_3
a=0;// 
a=0;//     new-array v6, v6, [B
a=0;// 
a=0;//     #v6=(Reference,[B);
a=0;//     fill-array-data v6, :array_4
a=0;// 
a=0;//     invoke-static {p1, v5}, Lcn/sharesdk/wechat/utils/WechatHelper;->a([B[B)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     invoke-static {p1, v6}, Lcn/sharesdk/wechat/utils/WechatHelper;->a([B[B)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v0, "jpg"
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,[B);v2=(Reference,[B);
a=0;//     invoke-static {p1, v2}, Lcn/sharesdk/wechat/utils/WechatHelper;->a([B[B)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const-string v0, "png"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-static {p1, v1}, Lcn/sharesdk/wechat/utils/WechatHelper;->a([B[B)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     const-string v0, "gif"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-static {p1, v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a([B[B)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     const-string v0, "bmp"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p1, v3}, Lcn/sharesdk/wechat/utils/WechatHelper;->a([B[B)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     invoke-static {p1, v4}, Lcn/sharesdk/wechat/utils/WechatHelper;->a([B[B)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     :cond_5
a=0;//     const-string v0, "tif"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 1
a=0;//         -0x77t
a=0;//         0x50t
a=0;//         0x4et
a=0;//         0x47t
a=0;//     .end array-data
a=0;// 
a=0;//     :array_1
a=0;//     .array-data 1
a=0;//         0x49t
a=0;//         0x49t
a=0;//         0x2at
a=0;//     .end array-data
a=0;// 
a=0;//     :array_2
a=0;//     .array-data 1
a=0;//         0x4dt
a=0;//         0x4dt
a=0;//         0x2at
a=0;//     .end array-data
a=0;// 
a=0;//     :array_3
a=0;//     .array-data 1
a=0;//         -0x1t
a=0;//         -0x28t
a=0;//         -0x1t
a=0;//         -0x20t
a=0;//     .end array-data
a=0;// 
a=0;//     :array_4
a=0;//     .array-data 1
a=0;//         -0x1t
a=0;//         -0x28t
a=0;//         -0x1t
a=0;//         -0x1ft
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXImageObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXImageObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXImageObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXImageObject;);
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p4, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcn/sharesdk/wechat/utils/WXImageObject;->imageData:[B
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/wechat/utils/WXImageObject;->imageData:[B
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "img"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p5, p6}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXImageObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXImageObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXImageObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXImageObject;);
a=0;//     const-string v1, "/data/"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p4}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iput-object v1, v0, Lcn/sharesdk/wechat/utils/WXImageObject;->imageData:[B
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, p1, p4}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "img"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p5, p6}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXImageObject;->imagePath:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXVideoObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXVideoObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXVideoObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXVideoObject;);
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXVideoObject;->videoUrl:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p5, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "video"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p6, p7}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXVideoObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXVideoObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXVideoObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXVideoObject;);
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXVideoObject;->videoUrl:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     invoke-direct {p0, p1, p5}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "video"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p6, p7}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXMusicObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXMusicObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXMusicObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXMusicObject;);
a=0;//     iput-object p5, v0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicUrl:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicDataUrl:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p6, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "music"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p7, p8}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXMusicObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXMusicObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXMusicObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXMusicObject;);
a=0;//     iput-object p5, v0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicUrl:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXMusicObject;->musicDataUrl:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     invoke-direct {p0, p1, p6}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "music"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p7, p8}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p4}, Lcn/sharesdk/wechat/utils/k;->b()Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->r()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".wxapi.WXEntryActivity"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-class v2, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " does not extend from "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-class v1, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-boolean v1, Lcn/sharesdk/wechat/utils/WechatHelper;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Throwable;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v1
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);v2=(Reference,Ljava/lang/Class;);
a=0;//     new-instance v1, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Throwable;);
a=0;//     invoke-direct {v1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/d;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/d;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcn/sharesdk/wechat/utils/d;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p1, v0, Lcn/sharesdk/wechat/utils/d;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     iput p3, v0, Lcn/sharesdk/wechat/utils/d;->b:I
a=0;// 
a=0;//     iput-object p4, p0, Lcn/sharesdk/wechat/utils/WechatHelper;->d:Lcn/sharesdk/wechat/utils/k;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WechatHelper;->c:Lcn/sharesdk/wechat/utils/j;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/wechat/utils/j;->a(Lcn/sharesdk/wechat/utils/l;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXTextObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXTextObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXTextObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXTextObject;);
a=0;//     iput-object p2, v0, Lcn/sharesdk/wechat/utils/WXTextObject;->text:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "text"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p3, p4}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a([B[B)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-ne p0, p1, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v3=(Uninit);v4=(Uninit);
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     array-length v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_2
a=0;// 
a=0;//     aget-byte v3, p0, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aget-byte v4, p1, v0
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;)[B
a=0;//     .locals 3
a=0;// 
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "checkArgs fail, thumbData is null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "checkArgs fail, thumbData is recycled"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/16 v0, 0x78
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/16 v1, 0x28
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_2
a=0;// 
a=0;//     invoke-direct {p0, p2, p3}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const v2, 0x8000
a=0;// 
a=0;//     #v2=(Char);
a=0;//     if-le v1, v2, :cond_2
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/sharesdk/framework/utils/R;->dipToPx(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x5
a=0;// 
a=0;//     invoke-direct {p0, p2, v1}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p2, p3, v1, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;[B)[B
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, p2}, Lcn/sharesdk/wechat/utils/WechatHelper;->a([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const-string v2, "png"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v2, "gif"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     :cond_1
a=0;//     new-instance v1, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     array-length v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const v3, 0x8000
a=0;// 
a=0;//     #v3=(Char);
a=0;//     if-le v2, v3, :cond_2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     array-length v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p2, v4, v2, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     const/16 v2, 0x78
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p1, v2}, Lcn/sharesdk/framework/utils/R;->dipToPx(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2, v2}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/graphics/BitmapFactory$Options;II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     :cond_2
a=0;//     iput-boolean v4, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     array-length v2, p2
a=0;// 
a=0;//     invoke-static {p2, v4, v2, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, p1, v1, v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)[B
a=0;//     .locals 5
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v0, 0x400
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v3, v0, [B
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v1, v3}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v3, v4, v0}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/FileInputStream;->read([B)I
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcn/sharesdk/wechat/utils/WechatHelper;->a([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXEmojiObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXEmojiObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXEmojiObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXEmojiObject;);
a=0;//     new-instance v1, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p4, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Lcn/sharesdk/wechat/utils/WXEmojiObject;->emojiData:[B
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/wechat/utils/WXEmojiObject;->emojiData:[B
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "emoji"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p5, p6}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXEmojiObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXEmojiObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXEmojiObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXEmojiObject;);
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXEmojiObject;->emojiPath:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0, p1, p4}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "emoji"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p5, p6}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const v4, 0x8000
a=0;// 
a=0;//     #v4=(Char);
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXWebpageObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXWebpageObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXWebpageObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXWebpageObject;);
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXWebpageObject;->webpageUrl:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     if-eqz p5, :cond_1
a=0;// 
a=0;//     invoke-virtual {p5}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p5, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     iget-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "checkArgs fail, thumbData is null"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v4, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "checkArgs fail, thumbData is too large: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " > "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, "webpage"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1, v0, p6, p7}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const v4, 0x8000
a=0;// 
a=0;//     #v4=(Char);
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXWebpageObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXWebpageObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXWebpageObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXWebpageObject;);
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXWebpageObject;->webpageUrl:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     if-eqz p5, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, p5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-direct {p0, p1, p5}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     iget-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "checkArgs fail, thumbData is null"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v4, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "checkArgs fail, thumbData is too large: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v1, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, " > "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "webpage"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1, v0, p6, p7}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXAppExtendObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXAppExtendObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXAppExtendObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXAppExtendObject;);
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXAppExtendObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p5, v0, Lcn/sharesdk/wechat/utils/WXAppExtendObject;->extInfo:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p6, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "appdata"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p7, p8}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXAppExtendObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXAppExtendObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXAppExtendObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXAppExtendObject;);
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXAppExtendObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p5, v0, Lcn/sharesdk/wechat/utils/WXAppExtendObject;->extInfo:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     invoke-direct {p0, p1, p6}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "appdata"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p7, p8}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;Ljava/lang/String;)[B
a=0;//     .locals 7
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     invoke-direct {v0}, Ljava/io/FileNotFoundException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "png"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const-string v2, "gif"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v2, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/32 v5, 0x8000
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     cmp-long v1, v3, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     invoke-static {p2, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     const/16 v1, 0x78
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {p1, v1}, Lcn/sharesdk/framework/utils/R;->dipToPx(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v2, v1, v1}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/graphics/BitmapFactory$Options;II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     invoke-static {p2, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-direct {p0, p1, v1, v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v2, "jpg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     const-string v2, "jpeg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     const-string v2, "bmp"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     const-string v2, "tif"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, p2}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "png"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     const-string v2, "gif"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 4
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXFileObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXFileObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXFileObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXFileObject;);
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXFileObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap$CompressFormat;);
a=0;//     const/16 v3, 0x64
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p5, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, p1, v0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "filedata"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p6, p7}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WXFileObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WXFileObject;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WXFileObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WXFileObject;);
a=0;//     iput-object p4, v0, Lcn/sharesdk/wechat/utils/WXFileObject;->filePath:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/wechat/utils/WXMediaMessage;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/WXMediaMessage;);
a=0;//     iput-object p2, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->title:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->description:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->mediaObject:Lcn/sharesdk/wechat/utils/WXMediaMessage$IMediaObject;
a=0;// 
a=0;//     invoke-direct {p0, p1, p5}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Lcn/sharesdk/wechat/utils/WXMediaMessage;->thumbData:[B
a=0;// 
a=0;//     const-string v0, "filedata"
a=0;// 
a=0;//     invoke-direct {p0, v1, v0, p6, p7}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WXMediaMessage;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/WechatHelper;->d:Lcn/sharesdk/wechat/utils/k;
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/a;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/a;);
a=0;//     const-string v1, "snsapi_userinfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iput-object v1, v0, Lcn/sharesdk/wechat/utils/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "sharesdk_wechat_auth"
a=0;// 
a=0;//     iput-object v1, v0, Lcn/sharesdk/wechat/utils/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WechatHelper;->c:Lcn/sharesdk/wechat/utils/j;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/wechat/utils/j;->a(Lcn/sharesdk/wechat/utils/l;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/wechat/utils/k;Lcn/sharesdk/framework/Platform$ShareParams;)V
a=0;//     .locals 7
a=0;// 
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/wechat/utils/k;->b()Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual {p2}, Lcn/sharesdk/framework/Platform$ShareParams;->getImagePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2}, Lcn/sharesdk/framework/Platform$ShareParams;->getImageUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p2}, Lcn/sharesdk/framework/Platform$ShareParams;->getImageData()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "images"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/R;->getCachePath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ".png"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v2, v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;
a=0;// 
a=0;//     const/16 v5, 0x64
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v3, v4, v5, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v3, "android.intent.action.SEND"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p2}, Lcn/sharesdk/framework/Platform$ShareParams;->getText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v3, v4}, Lcn/sharesdk/framework/Platform;->getShortLintk(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "android.intent.extra.TEXT"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v4, "Kdescription"
a=0;// 
a=0;//     invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     const-string v4, "android.intent.extra.STREAM"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {}, Ljava/net/URLConnection;->getFileNameMap()Ljava/net/FileNameMap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/net/FileNameMap;->getContentTypeFor(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const-string v0, "image/*"
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     const-string v0, "scene"
a=0;// 
a=0;//     const-class v3, Ljava/lang/Integer;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p2, v0, v3}, Lcn/sharesdk/framework/Platform$ShareParams;->get(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v0, v3, :cond_7
a=0;// 
a=0;//     const-string v0, "com.tencent.mm.ui.tools.ShareToTimeLineUI"
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "com.tencent.mm"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v0, 0x10000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_5
a=0;//     #v5=(Uninit);v6=(Uninit);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v0, "text/plain"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Integer);v3=(One);v4=(Conflicted);
a=0;//     const-string v0, "com.tencent.mm.ui.tools.ShareImgUI"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/WechatHelper;->c:Lcn/sharesdk/wechat/utils/j;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/j;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/sharesdk/wechat/utils/j;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/wechat/utils/WechatHandlerActivity;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/WechatHelper;->c:Lcn/sharesdk/wechat/utils/j;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/j;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/WechatHelper;->d:Lcn/sharesdk/wechat/utils/k;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-virtual {v0, p1, v1}, Lcn/sharesdk/wechat/utils/j;->a(Lcn/sharesdk/wechat/utils/WechatHandlerActivity;Lcn/sharesdk/wechat/utils/k;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcn/sharesdk/wechat/utils/k;)V
a=0;//     .locals 23
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Lcn/sharesdk/wechat/utils/k;->b()Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/Platform;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcn/sharesdk/wechat/utils/k;->a()Lcn/sharesdk/framework/Platform$ShareParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/Platform$ShareParams;);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcn/sharesdk/wechat/utils/k;->c()Lcn/sharesdk/framework/PlatformActionListener;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getShareType()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getTitle()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getScence()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getImagePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getImageUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getImageData()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getMusicUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getFilePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getExtInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     packed-switch v9, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "shareType = "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     const/16 v4, 0x9
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-interface {v8, v2, v4, v3}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v8=(Reference,Lcn/sharesdk/framework/PlatformActionListener;);v9=(Integer);v14=(Reference,Landroid/graphics/Bitmap;);v15=(Reference,Ljava/lang/String;);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct {v0, v4, v5, v7, v1}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_1
a=0;// 
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     move-object/from16 v8, p1
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v2 .. v8}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v8=(Conflicted);
a=0;//     if-eqz v14, :cond_2
a=0;// 
a=0;//     invoke-virtual {v14}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     move-object v6, v14
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move-object/from16 v8, p1
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v2 .. v8}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v8=(Conflicted);
a=0;//     if-eqz v10, :cond_3
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v10}, Lcn/sharesdk/framework/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     move-object/from16 v8, p1
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v2 .. v8}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);v8=(Conflicted);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     move-object/from16 v8, p1
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v2 .. v8}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v2, v8, v9}, Lcn/sharesdk/framework/Platform;->getShortLintk(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aget-object v12, v9, v11
a=0;// 
a=0;//     #v12=(Null);
a=0;//     const-string v9, " "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     aget-object v13, v8, v9
a=0;// 
a=0;//     #v13=(Null);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_4
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     move-object v14, v6
a=0;// 
a=0;//     move v15, v7
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v16, p1
a=0;// 
a=0;//     #v16=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v8 .. v16}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);v9=(One);v11=(Null);v15=(Reference,Ljava/lang/String;);v16=(Uninit);
a=0;//     if-eqz v14, :cond_5
a=0;// 
a=0;//     invoke-virtual {v14}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     move v15, v7
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v16, p1
a=0;// 
a=0;//     #v16=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v8 .. v16}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);v8=(Conflicted);v9=(One);v11=(Null);v15=(Reference,Ljava/lang/String;);v16=(Uninit);
a=0;//     if-eqz v10, :cond_6
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_6
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v10}, Lcn/sharesdk/framework/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     move v15, v7
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v16, p1
a=0;// 
a=0;//     #v16=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v8 .. v16}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);v8=(Conflicted);v9=(One);v11=(Null);v15=(Reference,Ljava/lang/String;);v16=(Uninit);
a=0;//     const-string v14, ""
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     move v15, v7
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v16, p1
a=0;// 
a=0;//     #v16=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v8 .. v16}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v6=(Reference,Ljava/lang/String;);v9=(Integer);v12=(Reference,Ljava/lang/String;);v13=(Reference,Ljava/lang/String;);v15=(Reference,Ljava/lang/String;);v16=(Uninit);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v2, v15, v8}, Lcn/sharesdk/framework/Platform;->getShortLintk(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     if-eqz v6, :cond_7
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_7
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move-object v13, v6
a=0;// 
a=0;//     move v14, v7
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v15, p1
a=0;// 
a=0;//     invoke-direct/range {v8 .. v15}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v8=(Integer);v9=(Integer);v14=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v14, :cond_8
a=0;// 
a=0;//     invoke-virtual {v14}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_8
a=0;// 
a=0;//     move-object/from16 v15, p0
a=0;// 
a=0;//     move-object/from16 v16, v3
a=0;// 
a=0;//     #v16=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v17, v4
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v18, v5
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v19, v12
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v20, v14
a=0;// 
a=0;//     #v20=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move/from16 v21, v7
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move-object/from16 v22, p1
a=0;// 
a=0;//     #v22=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v15 .. v22}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v6=(Conflicted);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);
a=0;//     if-eqz v10, :cond_9
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_9
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v10}, Lcn/sharesdk/framework/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move v14, v7
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v15, p1
a=0;// 
a=0;//     invoke-direct/range {v8 .. v15}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_9
a=0;//     #v6=(Conflicted);v8=(Integer);v9=(Integer);v14=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const-string v13, ""
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move v14, v7
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v15, p1
a=0;// 
a=0;//     invoke-direct/range {v8 .. v15}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v6=(Reference,Ljava/lang/String;);v9=(Integer);v14=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v2, v15, v8}, Lcn/sharesdk/framework/Platform;->getShortLintk(Ljava/lang/String;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     if-eqz v6, :cond_a
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_a
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move-object v13, v6
a=0;// 
a=0;//     move v14, v7
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v15, p1
a=0;// 
a=0;//     invoke-direct/range {v8 .. v15}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_a
a=0;//     #v8=(Integer);v9=(Integer);v14=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v14, :cond_b
a=0;// 
a=0;//     invoke-virtual {v14}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_b
a=0;// 
a=0;//     move-object/from16 v15, p0
a=0;// 
a=0;//     move-object/from16 v16, v3
a=0;// 
a=0;//     #v16=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v17, v4
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v18, v5
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v19, v12
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v20, v14
a=0;// 
a=0;//     #v20=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move/from16 v21, v7
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move-object/from16 v22, p1
a=0;// 
a=0;//     #v22=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v15 .. v22}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_b
a=0;//     #v6=(Conflicted);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);
a=0;//     if-eqz v10, :cond_c
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_c
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v10}, Lcn/sharesdk/framework/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move v14, v7
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v15, p1
a=0;// 
a=0;//     invoke-direct/range {v8 .. v15}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_c
a=0;//     #v6=(Conflicted);v8=(Integer);v9=(Integer);v14=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const-string v13, ""
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move v14, v7
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v15, p1
a=0;// 
a=0;//     invoke-direct/range {v8 .. v15}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v6=(Reference,Ljava/lang/String;);v9=(Integer);v14=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     if-ne v7, v8, :cond_d
a=0;// 
a=0;//     new-instance v2, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/Throwable;);
a=0;//     const-string v3, "WechatMoments does not support SAHRE_APP"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v2
a=0;// 
a=0;//     :cond_d
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ne v7, v8, :cond_e
a=0;// 
a=0;//     new-instance v2, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/Throwable;);
a=0;//     const-string v3, "WechatFavorite does not support SAHRE_APP"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v2
a=0;// 
a=0;//     :cond_e
a=0;//     if-eqz v6, :cond_f
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_f
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move-object v14, v6
a=0;// 
a=0;//     move v15, v7
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v16, p1
a=0;// 
a=0;//     #v16=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v8 .. v16}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_f
a=0;//     #v8=(Integer);v9=(Integer);v15=(Reference,Ljava/lang/String;);v16=(Uninit);
a=0;//     if-eqz v14, :cond_10
a=0;// 
a=0;//     invoke-virtual {v14}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_10
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move v15, v7
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v16, p1
a=0;// 
a=0;//     #v16=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v8 .. v16}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_10
a=0;//     #v6=(Conflicted);v8=(Integer);v9=(Integer);v15=(Reference,Ljava/lang/String;);v16=(Uninit);
a=0;//     if-eqz v10, :cond_11
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_11
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v10}, Lcn/sharesdk/framework/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move v15, v7
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v16, p1
a=0;// 
a=0;//     #v16=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v8 .. v16}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_11
a=0;//     #v6=(Conflicted);v8=(Integer);v9=(Integer);v15=(Reference,Ljava/lang/String;);v16=(Uninit);
a=0;//     const-string v14, ""
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move v15, v7
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v16, p1
a=0;// 
a=0;//     #v16=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v8 .. v16}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_7
a=0;//     #v6=(Reference,Ljava/lang/String;);v9=(Integer);v15=(Reference,Ljava/lang/String;);v16=(Uninit);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     if-ne v7, v8, :cond_12
a=0;// 
a=0;//     new-instance v2, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/Throwable;);
a=0;//     const-string v3, "WechatMoments does not support SHARE_FILE"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v2
a=0;// 
a=0;//     :cond_12
a=0;//     if-eqz v6, :cond_13
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_13
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move-object v13, v6
a=0;// 
a=0;//     move v14, v7
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v15, p1
a=0;// 
a=0;//     invoke-direct/range {v8 .. v15}, Lcn/sharesdk/wechat/utils/WechatHelper;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_13
a=0;//     #v8=(Integer);v9=(Integer);v14=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v14, :cond_14
a=0;// 
a=0;//     invoke-virtual {v14}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_14
a=0;// 
a=0;//     move-object/from16 v15, p0
a=0;// 
a=0;//     move-object/from16 v16, v3
a=0;// 
a=0;//     #v16=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v17, v4
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v18, v5
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v19, v12
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v20, v14
a=0;// 
a=0;//     #v20=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move/from16 v21, v7
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move-object/from16 v22, p1
a=0;// 
a=0;//     #v22=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v15 .. v22}, Lcn/sharesdk/wechat/utils/WechatHelper;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_14
a=0;//     #v6=(Conflicted);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);
a=0;//     if-eqz v10, :cond_15
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_15
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v10}, Lcn/sharesdk/framework/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move v14, v7
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v15, p1
a=0;// 
a=0;//     invoke-direct/range {v8 .. v15}, Lcn/sharesdk/wechat/utils/WechatHelper;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_15
a=0;//     #v6=(Conflicted);v8=(Integer);v9=(Integer);v14=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const-string v13, ""
a=0;// 
a=0;//     move-object/from16 v8, p0
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v9, v3
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     move-object v10, v4
a=0;// 
a=0;//     move-object v11, v5
a=0;// 
a=0;//     move v14, v7
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v15, p1
a=0;// 
a=0;//     invoke-direct/range {v8 .. v15}, Lcn/sharesdk/wechat/utils/WechatHelper;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_8
a=0;//     #v6=(Reference,Ljava/lang/String;);v9=(Integer);v14=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     if-ne v7, v8, :cond_16
a=0;// 
a=0;//     new-instance v2, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/Throwable;);
a=0;//     const-string v3, "WechatMoments does not support SHARE_EMOJI"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v2
a=0;// 
a=0;//     :cond_16
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ne v7, v8, :cond_17
a=0;// 
a=0;//     new-instance v2, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/Throwable;);
a=0;//     const-string v3, "WechatFavorite does not support SHARE_EMOJI"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v2
a=0;// 
a=0;//     :cond_17
a=0;//     if-eqz v6, :cond_18
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lez v8, :cond_18
a=0;// 
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     move-object/from16 v8, p1
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v2 .. v8}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_18
a=0;//     #v8=(Integer);
a=0;//     if-eqz v10, :cond_19
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_19
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2, v10}, Lcn/sharesdk/framework/utils/BitmapHelper;->downloadBitmap(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     move-object/from16 v8, p1
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v2 .. v8}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_19
a=0;//     #v6=(Conflicted);v8=(Integer);
a=0;//     if-eqz v14, :cond_1a
a=0;// 
a=0;//     invoke-virtual {v14}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1a
a=0;// 
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object v6, v14
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move-object/from16 v8, p1
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v2 .. v8}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_1a
a=0;//     #v2=(Conflicted);v6=(Conflicted);v8=(Integer);
a=0;//     const-string v6, ""
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     move-object/from16 v8, p1
a=0;// 
a=0;//     #v8=(Reference,Lcn/sharesdk/wechat/utils/k;);
a=0;//     invoke-direct/range {v2 .. v8}, Lcn/sharesdk/wechat/utils/WechatHelper;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcn/sharesdk/wechat/utils/k;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_5
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public b()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/WechatHelper;->c:Lcn/sharesdk/wechat/utils/j;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/j;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/wechat/utils/j;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public c()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/WechatHelper;->c:Lcn/sharesdk/wechat/utils/j;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/j;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/wechat/utils/j;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
