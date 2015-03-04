.class Lnet/youmi/android/offers/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lnet/youmi/android/offers/EarnPointsOrderList;

.field final synthetic c:Lnet/youmi/android/offers/f;


# direct methods
.method constructor <init>(Lnet/youmi/android/offers/f;Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderList;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/offers/g;->c:Lnet/youmi/android/offers/f;

    iput-object p2, p0, Lnet/youmi/android/offers/g;->a:Landroid/content/Context;

    iput-object p3, p0, Lnet/youmi/android/offers/g;->b:Lnet/youmi/android/offers/EarnPointsOrderList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/offers/g;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/offers/c;->a(Landroid/content/Context;)Lnet/youmi/android/offers/c;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/offers/g;->b:Lnet/youmi/android/offers/EarnPointsOrderList;

    invoke-virtual {v0, v1}, Lnet/youmi/android/offers/c;->a(Lnet/youmi/android/offers/EarnPointsOrderList;)V

    return-void
.end method
