.class Lnet/youmi/android/spot/i;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lnet/youmi/android/spot/SplashView;


# direct methods
.method private constructor <init>(Lnet/youmi/android/spot/SplashView;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/youmi/android/spot/SplashView;Lnet/youmi/android/spot/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/spot/i;-><init>(Lnet/youmi/android/spot/SplashView;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    const/4 v2, 0x0

    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->a(Lnet/youmi/android/spot/SplashView;)Landroid/widget/ImageView;

    move-result-object v0

    if-ne p1, v0, :cond_6

    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->b(Lnet/youmi/android/spot/SplashView;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-virtual {v0}, Lnet/youmi/android/spot/SplashView;->handleClick()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->b(Lnet/youmi/android/spot/SplashView;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->c(Lnet/youmi/android/spot/SplashView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->c(Lnet/youmi/android/spot/SplashView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-virtual {v0}, Lnet/youmi/android/spot/SplashView;->handleClick()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->b(Lnet/youmi/android/spot/SplashView;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->d(Lnet/youmi/android/spot/SplashView;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-virtual {v0}, Lnet/youmi/android/spot/SplashView;->handleClick()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->c(Lnet/youmi/android/spot/SplashView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->c(Lnet/youmi/android/spot/SplashView;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-virtual {v0}, Lnet/youmi/android/spot/SplashView;->handleClick()V

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-static {v0}, Lnet/youmi/android/spot/SplashView;->e(Lnet/youmi/android/spot/SplashView;)Landroid/widget/ImageButton;

    move-result-object v0

    if-ne p1, v0, :cond_7

    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    iget-object v0, v0, Lnet/youmi/android/spot/SplashView;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    iget-object v1, v1, Lnet/youmi/android/spot/SplashView;->b:Ljava/lang/Runnable;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/i;->a:Lnet/youmi/android/spot/SplashView;

    invoke-virtual {v0}, Lnet/youmi/android/spot/SplashView;->handleClick()V

    goto :goto_0
.end method
