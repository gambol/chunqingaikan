.class public Lnet/youmi/android/c/a/k;
.super Lnet/youmi/android/c/a/p;

# interfaces
.implements Lnet/youmi/android/c/a/h;


# instance fields
.field private a:Lnet/youmi/android/c/a/i;

.field private b:Landroid/graphics/Bitmap;

.field private c:Z

.field private d:Z

.field private e:Lnet/youmi/android/c/a/n;

.field private f:Landroid/content/Context;

.field private g:Z

.field private h:Landroid/view/View;

.field private i:Lnet/youmi/android/c/a/o;

.field private j:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1}, Lnet/youmi/android/c/a/p;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    iput-object v1, p0, Lnet/youmi/android/c/a/k;->b:Landroid/graphics/Bitmap;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/c/a/k;->c:Z

    iput-boolean v2, p0, Lnet/youmi/android/c/a/k;->d:Z

    iput-object v1, p0, Lnet/youmi/android/c/a/k;->e:Lnet/youmi/android/c/a/n;

    iput-object v1, p0, Lnet/youmi/android/c/a/k;->f:Landroid/content/Context;

    iput-boolean v2, p0, Lnet/youmi/android/c/a/k;->g:Z

    iput-object v1, p0, Lnet/youmi/android/c/a/k;->h:Landroid/view/View;

    sget-object v0, Lnet/youmi/android/c/a/o;->b:Lnet/youmi/android/c/a/o;

    iput-object v0, p0, Lnet/youmi/android/c/a/k;->i:Lnet/youmi/android/c/a/o;

    new-instance v0, Lnet/youmi/android/c/a/l;

    invoke-direct {v0, p0}, Lnet/youmi/android/c/a/l;-><init>(Lnet/youmi/android/c/a/k;)V

    iput-object v0, p0, Lnet/youmi/android/c/a/k;->j:Landroid/os/Handler;

    iput-object p1, p0, Lnet/youmi/android/c/a/k;->f:Landroid/content/Context;

    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/k;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/c/a/k;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/c/a/k;->b:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lnet/youmi/android/c/a/k;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->h:Landroid/view/View;

    return-object v0
.end method

.method static synthetic b(Lnet/youmi/android/c/a/k;)Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->b:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->j:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->j:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/c/a/k;->j:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lnet/youmi/android/c/a/k;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0}, Lnet/youmi/android/c/a/k;->invalidate()V

    return-void
.end method

.method static synthetic c(Lnet/youmi/android/c/a/k;)V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/c/a/k;->c()V

    return-void
.end method

.method static synthetic d(Lnet/youmi/android/c/a/k;)Lnet/youmi/android/c/a/i;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    return-object v0
.end method

.method static synthetic e(Lnet/youmi/android/c/a/k;)Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/c/a/k;->c:Z

    return v0
.end method

.method static synthetic f(Lnet/youmi/android/c/a/k;)V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/c/a/k;->b()V

    return-void
.end method

.method static synthetic g(Lnet/youmi/android/c/a/k;)Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/c/a/k;->d:Z

    return v0
.end method

.method static synthetic h(Lnet/youmi/android/c/a/k;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->j:Landroid/os/Handler;

    return-object v0
.end method

.method private setGifDecoderImage(Ljava/io/InputStream;)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/c/a/i;

    invoke-direct {v0, p0}, Lnet/youmi/android/c/a/i;-><init>(Lnet/youmi/android/c/a/h;)V

    iput-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    invoke-virtual {v0, p1}, Lnet/youmi/android/c/a/i;->a(Ljava/io/InputStream;)V

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->start()V

    return-void
.end method

.method private setGifDecoderImage([B)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/c/a/i;

    invoke-direct {v0, p0}, Lnet/youmi/android/c/a/i;-><init>(Lnet/youmi/android/c/a/h;)V

    iput-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    invoke-virtual {v0, p1}, Lnet/youmi/android/c/a/i;->a([B)V

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->start()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->a()V

    :cond_0
    return-void
.end method

.method public a(ZI)V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, -0x1

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    if-eqz v0, :cond_6

    sget-object v0, Lnet/youmi/android/c/a/m;->a:[I

    iget-object v1, p0, Lnet/youmi/android/c/a/k;->i:Lnet/youmi/android/c/a/o;

    invoke-virtual {v1}, Lnet/youmi/android/c/a/o;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    if-ne p2, v3, :cond_0

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->b()I

    move-result v0

    if-le v0, v2, :cond_1

    new-instance v0, Lnet/youmi/android/c/a/n;

    invoke-direct {v0, p0, v4}, Lnet/youmi/android/c/a/n;-><init>(Lnet/youmi/android/c/a/k;Lnet/youmi/android/c/a/l;)V

    invoke-virtual {v0}, Lnet/youmi/android/c/a/n;->start()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lnet/youmi/android/c/a/k;->b()V

    goto :goto_0

    :pswitch_1
    if-ne p2, v2, :cond_2

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/c/a/k;->b:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lnet/youmi/android/c/a/k;->b()V

    goto :goto_0

    :cond_2
    if-ne p2, v3, :cond_0

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->b()I

    move-result v0

    if-le v0, v2, :cond_3

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->e:Lnet/youmi/android/c/a/n;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/c/a/n;

    invoke-direct {v0, p0, v4}, Lnet/youmi/android/c/a/n;-><init>(Lnet/youmi/android/c/a/k;Lnet/youmi/android/c/a/l;)V

    iput-object v0, p0, Lnet/youmi/android/c/a/k;->e:Lnet/youmi/android/c/a/n;

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->e:Lnet/youmi/android/c/a/n;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/n;->start()V

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lnet/youmi/android/c/a/k;->b()V

    goto :goto_0

    :pswitch_2
    if-ne p2, v2, :cond_4

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/c/a/k;->b:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Lnet/youmi/android/c/a/k;->b()V

    goto :goto_0

    :cond_4
    if-ne p2, v3, :cond_5

    invoke-direct {p0}, Lnet/youmi/android/c/a/k;->b()V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lnet/youmi/android/c/a/k;->e:Lnet/youmi/android/c/a/n;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/c/a/n;

    invoke-direct {v0, p0, v4}, Lnet/youmi/android/c/a/n;-><init>(Lnet/youmi/android/c/a/k;Lnet/youmi/android/c/a/l;)V

    iput-object v0, p0, Lnet/youmi/android/c/a/k;->e:Lnet/youmi/android/c/a/n;

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->e:Lnet/youmi/android/c/a/n;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/n;->start()V

    goto :goto_0

    :cond_6
    const-string v0, "gif"

    const-string v1, "parse error"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 1

    invoke-super {p0}, Lnet/youmi/android/c/a/p;->onSaveInstanceState()Landroid/os/Parcelable;

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    invoke-virtual {v0}, Lnet/youmi/android/c/a/i;->a()V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public setAsBackground(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/c/a/k;->h:Landroid/view/View;

    return-void
.end method

.method public setGifImage(I)V
    .locals 1

    invoke-virtual {p0}, Lnet/youmi/android/c/a/k;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/youmi/android/c/a/k;->setGifDecoderImage(Ljava/io/InputStream;)V

    return-void
.end method

.method public setGifImage(Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/c/a/k;->setGifDecoderImage(Ljava/io/InputStream;)V

    return-void
.end method

.method public setGifImage([B)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/c/a/k;->setGifDecoderImage([B)V

    return-void
.end method

.method public setGifImageType(Lnet/youmi/android/c/a/o;)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/c/a/k;->a:Lnet/youmi/android/c/a/i;

    if-nez v0, :cond_0

    iput-object p1, p0, Lnet/youmi/android/c/a/k;->i:Lnet/youmi/android/c/a/o;

    :cond_0
    return-void
.end method
