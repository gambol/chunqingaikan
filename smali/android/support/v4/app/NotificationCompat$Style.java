package android.support.v4.app; class NotificationCompat$Style { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/app/NotificationCompat$Style;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x409
a=0;//     name = "Style"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mBigContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;// .field mSummaryText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field mSummaryTextSet:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 570
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 575
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$Style;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mSummaryTextSet:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public build()Landroid/app/Notification;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 587
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 588
a=0;//     .local v0, "notification":Landroid/app/Notification;
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 589
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 591
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setBuilder(Landroid/support/v4/app/NotificationCompat$Builder;)V
a=0;//     .locals 1
a=0;//     .param p1, "builder"    # Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 578
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 579
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     .line 580
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 581
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/app/NotificationCompat$Builder;->setStyle(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     .line 584
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
