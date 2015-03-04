package android.support.v4.app; class NotificationCompatJellybean { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationCompatJellybean;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompatJellybean.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/app/Notification$Builder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZZILjava/lang/CharSequence;)V
a=0;//     .locals 7
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "n"    # Landroid/app/Notification;
a=0;//     .param p3, "contentTitle"    # Ljava/lang/CharSequence;
a=0;//     .param p4, "contentText"    # Ljava/lang/CharSequence;
a=0;//     .param p5, "contentInfo"    # Ljava/lang/CharSequence;
a=0;//     .param p6, "tickerView"    # Landroid/widget/RemoteViews;
a=0;//     .param p7, "number"    # I
a=0;//     .param p8, "contentIntent"    # Landroid/app/PendingIntent;
a=0;//     .param p9, "fullScreenIntent"    # Landroid/app/PendingIntent;
a=0;//     .param p10, "largeIcon"    # Landroid/graphics/Bitmap;
a=0;//     .param p11, "mProgressMax"    # I
a=0;//     .param p12, "mProgress"    # I
a=0;//     .param p13, "mProgressIndeterminate"    # Z
a=0;//     .param p14, "useChronometer"    # Z
a=0;//     .param p15, "priority"    # I
a=0;//     .param p16, "subText"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompatJellybean;);
a=0;//     new-instance v3, Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/app/Notification$Builder;);
a=0;//     invoke-direct {v3, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget-wide v4, p2, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, p2, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p2, Landroid/app/Notification;->iconLevel:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/RemoteViews;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p2, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v3, v4, p6}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p2, Landroid/app/Notification;->sound:Landroid/net/Uri;
a=0;// 
a=0;//     iget v5, p2, Landroid/app/Notification;->audioStreamType:I
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p2, Landroid/app/Notification;->vibrate:[J
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, p2, Landroid/app/Notification;->ledARGB:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p2, Landroid/app/Notification;->ledOnMS:I
a=0;// 
a=0;//     iget v6, p2, Landroid/app/Notification;->ledOffMS:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v4, v5, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget v3, p2, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v3, p2, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v3, v3, 0x8
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v3, p2, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v3, v3, 0x10
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget v4, p2, Landroid/app/Notification;->defaults:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p16
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p5}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p8}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v3, p2, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit16 v3, v3, 0x80
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Boolean);
a=0;//     move-object/from16 v0, p9
a=0;// 
a=0;//     invoke-virtual {v4, v0, v3}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification$Builder;);
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p7}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move/from16 v0, p14
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move/from16 v0, p15
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move/from16 v0, p11
a=0;// 
a=0;//     move/from16 v1, p12
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, p13
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v3, v0, v1, v2}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean;->b:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// 
a=0;//     .line 34
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);v3=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # I
a=0;//     .param p2, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "intent"    # Landroid/app/PendingIntent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompatJellybean;->b:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addBigPictureStyle(Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Landroid/graphics/Bitmap;)V
a=0;//     .locals 3
a=0;//     .param p1, "bigContentTitle"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "useSummary"    # Z
a=0;//     .param p3, "summaryText"    # Ljava/lang/CharSequence;
a=0;//     .param p4, "bigPicture"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     new-instance v1, Landroid/app/Notification$BigPictureStyle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification$BigPictureStyle;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationCompatJellybean;->b:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-direct {v1, v2}, Landroid/app/Notification$BigPictureStyle;-><init>(Landroid/app/Notification$Builder;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification$BigPictureStyle;);
a=0;//     invoke-virtual {v1, p1}, Landroid/app/Notification$BigPictureStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Landroid/app/Notification$BigPictureStyle;->bigPicture(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 80
a=0;//     .local v0, "style":Landroid/app/Notification$BigPictureStyle;
a=0;//     #v0=(Reference,Landroid/app/Notification$BigPictureStyle;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v0, p3}, Landroid/app/Notification$BigPictureStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;
a=0;// 
a=0;//     .line 83
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addBigTextStyle(Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V
a=0;//     .locals 3
a=0;//     .param p1, "bigContentTitle"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "useSummary"    # Z
a=0;//     .param p3, "summaryText"    # Ljava/lang/CharSequence;
a=0;//     .param p4, "bigText"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     new-instance v1, Landroid/app/Notification$BigTextStyle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification$BigTextStyle;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationCompatJellybean;->b:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-direct {v1, v2}, Landroid/app/Notification$BigTextStyle;-><init>(Landroid/app/Notification$Builder;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification$BigTextStyle;);
a=0;//     invoke-virtual {v1, p1}, Landroid/app/Notification$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 70
a=0;//     .local v0, "style":Landroid/app/Notification$BigTextStyle;
a=0;//     #v0=(Reference,Landroid/app/Notification$BigTextStyle;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 71
a=0;//     invoke-virtual {v0, p3}, Landroid/app/Notification$BigTextStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addInboxStyle(Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/util/ArrayList;)V
a=0;//     .locals 5
a=0;//     .param p1, "bigContentTitle"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "useSummary"    # Z
a=0;//     .param p3, "summaryText"    # Ljava/lang/CharSequence;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/CharSequence;",
a=0;//             "Z",
a=0;//             "Ljava/lang/CharSequence;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/CharSequence;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     .local p4, "texts":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/CharSequence;>;"
a=0;//     new-instance v3, Landroid/app/Notification$InboxStyle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/app/Notification$InboxStyle;);
a=0;//     iget-object v4, p0, Landroid/support/v4/app/NotificationCompatJellybean;->b:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-direct {v3, v4}, Landroid/app/Notification$InboxStyle;-><init>(Landroid/app/Notification$Builder;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification$InboxStyle;);
a=0;//     invoke-virtual {v3, p1}, Landroid/app/Notification$InboxStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 89
a=0;//     .local v1, "style":Landroid/app/Notification$InboxStyle;
a=0;//     #v1=(Reference,Landroid/app/Notification$InboxStyle;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {v1, p3}, Landroid/app/Notification$InboxStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 93
a=0;//     .local v2, "text":Ljava/lang/CharSequence;
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Notification$InboxStyle;->addLine(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 95
a=0;//     .end local v2    # "text":Ljava/lang/CharSequence;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public build()Landroid/app/Notification;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompatJellybean;->b:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
