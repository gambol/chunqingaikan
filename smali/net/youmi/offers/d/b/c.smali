.class Lnet/youmi/android/offers/d/b/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/offers/PointsChangeNotify;

.field final synthetic b:I

.field final synthetic c:Lnet/youmi/android/offers/d/b/b;


# direct methods
.method constructor <init>(Lnet/youmi/android/offers/d/b/b;Lnet/youmi/android/offers/PointsChangeNotify;I)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/offers/d/b/c;->c:Lnet/youmi/android/offers/d/b/b;

    iput-object p2, p0, Lnet/youmi/android/offers/d/b/c;->a:Lnet/youmi/android/offers/PointsChangeNotify;

    iput p3, p0, Lnet/youmi/android/offers/d/b/c;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/offers/d/b/c;->a:Lnet/youmi/android/offers/PointsChangeNotify;

    iget v1, p0, Lnet/youmi/android/offers/d/b/c;->b:I

    invoke-interface {v0, v1}, Lnet/youmi/android/offers/PointsChangeNotify;->onPointBalanceChange(I)V

    return-void
.end method
