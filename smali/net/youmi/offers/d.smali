.class Lnet/youmi/android/offers/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/offers/PointsEarnNotify;

.field final synthetic b:Lnet/youmi/android/offers/EarnPointsOrderList;

.field final synthetic c:Lnet/youmi/android/offers/c;


# direct methods
.method constructor <init>(Lnet/youmi/android/offers/c;Lnet/youmi/android/offers/PointsEarnNotify;Lnet/youmi/android/offers/EarnPointsOrderList;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/offers/d;->c:Lnet/youmi/android/offers/c;

    iput-object p2, p0, Lnet/youmi/android/offers/d;->a:Lnet/youmi/android/offers/PointsEarnNotify;

    iput-object p3, p0, Lnet/youmi/android/offers/d;->b:Lnet/youmi/android/offers/EarnPointsOrderList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/offers/d;->a:Lnet/youmi/android/offers/PointsEarnNotify;

    iget-object v1, p0, Lnet/youmi/android/offers/d;->c:Lnet/youmi/android/offers/c;

    invoke-static {v1}, Lnet/youmi/android/offers/c;->a(Lnet/youmi/android/offers/c;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/offers/d;->b:Lnet/youmi/android/offers/EarnPointsOrderList;

    invoke-interface {v0, v1, v2}, Lnet/youmi/android/offers/PointsEarnNotify;->onPointEarn(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderList;)V

    return-void
.end method
