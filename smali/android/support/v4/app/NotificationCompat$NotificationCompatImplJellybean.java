package android.support.v4.app; class NotificationCompat$NotificationCompatImplJellybean { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "NotificationCompatImplJellybean"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;
a=0;//     .locals 21
a=0;//     .param p1, "b"    # Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     new-instance v1, Landroid/support/v4/app/NotificationCompatJellybean;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/NotificationCompatJellybean;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v6, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentInfo:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v7, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mTickerView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RemoteViews;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v8, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mNumber:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v9, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v9=(Reference,Landroid/app/PendingIntent;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v10, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mFullScreenIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/PendingIntent;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v11, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mLargeIcon:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v11=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v12, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressMax:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgress:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-boolean v14, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressIndeterminate:Z
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-boolean v15, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mUseChronometer:Z
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mSubText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-direct/range {v1 .. v17}, Landroid/support/v4/app/NotificationCompatJellybean;-><init>(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZZILjava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 122
a=0;//     .local v1, "jbBuilder":Landroid/support/v4/app/NotificationCompatJellybean;
a=0;//     #v1=(Reference,Landroid/support/v4/app/NotificationCompatJellybean;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     .local v19, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v18=(Conflicted);v19=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v18, Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     .line 123
a=0;//     .local v18, "action":Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/app/NotificationCompat$Action;->icon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v4/app/NotificationCompat$Action;->title:Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/NotificationCompat$Action;->actionIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v4}, Landroid/support/v4/app/NotificationCompatJellybean;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 125
a=0;//     .end local v18    # "action":Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v18=(Conflicted);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/NotificationCompat$Style;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 126
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     instance-of v2, v2, Landroid/support/v4/app/NotificationCompat$BigTextStyle;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 127
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Landroid/support/v4/app/NotificationCompat$Style;);
a=0;//     check-cast v20, Landroid/support/v4/app/NotificationCompat$BigTextStyle;
a=0;// 
a=0;//     .line 128
a=0;//     .local v20, "style":Landroid/support/v4/app/NotificationCompat$BigTextStyle;
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mBigContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-boolean v3, v0, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mSummaryTextSet:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mSummaryText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mBigText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Landroid/support/v4/app/NotificationCompatJellybean;->addBigTextStyle(Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 146
a=0;//     .end local v20    # "style":Landroid/support/v4/app/NotificationCompat$BigTextStyle;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v20=(Conflicted);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/NotificationCompatJellybean;->build()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 132
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v3=(Reference,Ujava/lang/Object;);v20=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/NotificationCompat$Style;);
a=0;//     instance-of v2, v2, Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 133
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Landroid/support/v4/app/NotificationCompat$Style;);
a=0;//     check-cast v20, Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;// 
a=0;//     .line 134
a=0;//     .local v20, "style":Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mBigContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-boolean v3, v0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryTextSet:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mTexts:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Landroid/support/v4/app/NotificationCompatJellybean;->addInboxStyle(Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 138
a=0;//     .end local v20    # "style":Landroid/support/v4/app/NotificationCompat$InboxStyle;
a=0;//     :cond_3
a=0;//     #v2=(Boolean);v3=(Reference,Ujava/lang/Object;);v20=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/NotificationCompat$Style;);
a=0;//     instance-of v2, v2, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Landroid/support/v4/app/NotificationCompat$Style;);
a=0;//     check-cast v20, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
a=0;// 
a=0;//     .line 140
a=0;//     .local v20, "style":Landroid/support/v4/app/NotificationCompat$BigPictureStyle;
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mBigContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-boolean v3, v0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mSummaryTextSet:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mSummaryText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/NotificationCompat$BigPictureStyle;->mPicture:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Landroid/support/v4/app/NotificationCompatJellybean;->addBigPictureStyle(Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
