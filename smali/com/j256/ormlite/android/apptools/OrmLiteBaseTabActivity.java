package com.j256.ormlite.android.apptools; class OrmLiteBaseTabActivity { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;
a=0;// .super Landroid/app/TabActivity;
a=0;// .source "OrmLiteBaseTabActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<H:",
a=0;//         "Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;",
a=0;//         ">",
a=0;//         "Landroid/app/TabActivity;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private volatile created:Z
a=0;// 
a=0;// .field private volatile destroyed:Z
a=0;// 
a=0;// .field private volatile helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "TH;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity<TH;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 16
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/TabActivity;-><init>()V
a=0;// 
a=0;//     .line 19
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->created:Z
a=0;// 
a=0;//     .line 20
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->destroyed:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity<TH;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->getHelper()Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;->getConnectionSource()Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHelper()Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TH;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity<TH;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 27
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->created:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "A call has not been made to onCreate() yet so the helper is null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 29
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->destroyed:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 30
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "A call to onDestroy has already been made and the helper cannot be used after that point"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 33
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Helper is null for some unknown reason"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 36
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getHelperInternal(Landroid/content/Context;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             ")TH;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity<TH;>;"
a=0;//     invoke-static {p1}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->getHelper(Landroid/content/Context;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 78
a=0;//     .local v0, "newHelper":Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;, "TH;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity<TH;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 50
a=0;//     invoke-virtual {p0, p0}, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->getHelperInternal(Landroid/content/Context;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     .line 51
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->created:Z
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/app/TabActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 54
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity<TH;>;"
a=0;//     invoke-super {p0}, Landroid/app/TabActivity;->onDestroy()V
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->releaseHelper(Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;)V
a=0;// 
a=0;//     .line 60
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->destroyed:Z
a=0;// 
a=0;//     .line 61
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected releaseHelper(Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TH;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity<TH;>;"
a=0;//     .local p1, "helper":Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;, "TH;"
a=0;//     invoke-static {}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->releaseHelper()V
a=0;// 
a=0;//     .line 92
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseTabActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
}}
