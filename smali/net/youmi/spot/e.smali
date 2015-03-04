.class Lnet/youmi/android/spot/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lnet/youmi/android/spot/a;


# direct methods
.method private constructor <init>(Lnet/youmi/android/spot/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/youmi/android/spot/a;Lnet/youmi/android/spot/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/spot/e;-><init>(Lnet/youmi/android/spot/a;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->b(Lnet/youmi/android/spot/a;)Landroid/widget/ImageView;

    move-result-object v0

    if-ne p1, v0, :cond_6

    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->e(Lnet/youmi/android/spot/a;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->f(Lnet/youmi/android/spot/a;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->e(Lnet/youmi/android/spot/a;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->g(Lnet/youmi/android/spot/a;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->g(Lnet/youmi/android/spot/a;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->f(Lnet/youmi/android/spot/a;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->e(Lnet/youmi/android/spot/a;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->c(Lnet/youmi/android/spot/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->f(Lnet/youmi/android/spot/a;)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->g(Lnet/youmi/android/spot/a;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->g(Lnet/youmi/android/spot/a;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->f(Lnet/youmi/android/spot/a;)V

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->a(Lnet/youmi/android/spot/a;)Landroid/widget/ImageButton;

    move-result-object v0

    if-ne p1, v0, :cond_7

    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-virtual {v0}, Lnet/youmi/android/spot/a;->d()Z

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/e;->a:Lnet/youmi/android/spot/a;

    invoke-static {v0}, Lnet/youmi/android/spot/a;->f(Lnet/youmi/android/spot/a;)V

    goto :goto_0
.end method
