package com.j256.ormlite.android.apptools; class OrmLiteBaseActivity { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "OrmLiteBaseActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<H:",
a=0;//         "Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;",
a=0;//         ">",
a=0;//         "Landroid/app/Activity;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static logger:Lcom/j256/ormlite/logger/Logger;
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
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     const-class v0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/logger/LoggerFactory;->getLogger(Ljava/lang/Class;)Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity<TH;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 24
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->created:Z
a=0;// 
a=0;//     .line 28
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->destroyed:Z
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
a=0;//     .line 53
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity<TH;>;"
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->getHelper()Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
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
a=0;//     .line 35
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity<TH;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 36
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->created:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 37
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
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->destroyed:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 39
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
a=0;//     .line 42
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
a=0;//     .line 45
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getHelperInternal(Landroid/content/Context;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;//     .locals 3
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
a=0;//     .line 84
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity<TH;>;"
a=0;//     invoke-static {p1}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->getHelper(Landroid/content/Context;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "newHelper":Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;, "TH;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     sget-object v1, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v2, "{}: got new helper {} from OpenHelperManager"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p0, v0}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 86
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity<TH;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     invoke-virtual {p0, p0}, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->getHelperInternal(Landroid/content/Context;)Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     .line 60
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->created:Z
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity<TH;>;"
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;);
a=0;//     invoke-virtual {p0, v0}, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->releaseHelper(Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;)V
a=0;// 
a=0;//     .line 69
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->destroyed:Z
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected releaseHelper(Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TH;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity<TH;>;"
a=0;//     .local p1, "helper":Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;, "TH;"
a=0;//     invoke-static {}, Lcom/j256/ormlite/android/apptools/OpenHelperManager;->releaseHelper()V
a=0;// 
a=0;//     .line 100
a=0;//     sget-object v0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->logger:Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     const-string v1, "{}: helper {} was released, set to null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p0, p1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 101
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;->helper:Lcom/j256/ormlite/android/apptools/OrmLiteSqliteOpenHelper;
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     .local p0, "this":Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity;, "Lcom/j256/ormlite/android/apptools/OrmLiteBaseActivity<TH;>;"
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "@"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-super {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
