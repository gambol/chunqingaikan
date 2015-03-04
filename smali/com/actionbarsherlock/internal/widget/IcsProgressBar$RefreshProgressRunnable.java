package com.actionbarsherlock.internal.widget; class IcsProgressBar$RefreshProgressRunnable { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;
a=0;// .super Ljava/lang/Object;
a=0;// .source "IcsProgressBar.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "RefreshProgressRunnable"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mFromUser:Z
a=0;// 
a=0;// .field private mId:I
a=0;// 
a=0;// .field private mProgress:I
a=0;// 
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;IIZ)V
a=0;//     .locals 0
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "progress"    # I
a=0;//     .param p4, "fromUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->this$0:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 607
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;);
a=0;//     iput p2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->mId:I
a=0;// 
a=0;//     .line 608
a=0;//     iput p3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->mProgress:I
a=0;// 
a=0;//     .line 609
a=0;//     iput-boolean p4, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->mFromUser:Z
a=0;// 
a=0;//     .line 610
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->this$0:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsProgressBar;);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->mId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->mProgress:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-boolean v3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->mFromUser:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v0, v1, v2, v3, v4}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->access$0(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;IIZZ)V
a=0;// 
a=0;//     .line 615
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->this$0:Lcom/actionbarsherlock/internal/widget/IcsProgressBar;
a=0;// 
a=0;//     invoke-static {v0, p0}, Lcom/actionbarsherlock/internal/widget/IcsProgressBar;->access$1(Lcom/actionbarsherlock/internal/widget/IcsProgressBar;Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;)V
a=0;// 
a=0;//     .line 616
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setup(IIZ)V
a=0;//     .locals 0
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "progress"    # I
a=0;//     .param p3, "fromUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 619
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->mId:I
a=0;// 
a=0;//     .line 620
a=0;//     iput p2, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->mProgress:I
a=0;// 
a=0;//     .line 621
a=0;//     iput-boolean p3, p0, Lcom/actionbarsherlock/internal/widget/IcsProgressBar$RefreshProgressRunnable;->mFromUser:Z
a=0;// 
a=0;//     .line 622
a=0;//     return-void
a=0;// .end method
}}
