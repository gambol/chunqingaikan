package com.actionbarsherlock.internal.widget; class IcsListPopupWindow$PopupDataSetObserver { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;
a=0;// .super Landroid/database/DataSetObserver;
a=0;// .source "IcsListPopupWindow.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "PopupDataSetObserver"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 582
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 582
a=0;//     invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;-><init>(Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 585
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 587
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->show()V
a=0;// 
a=0;//     .line 589
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInvalidated()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 593
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow$PopupDataSetObserver;->this$0:Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/IcsListPopupWindow;->dismiss()V
a=0;// 
a=0;//     .line 594
a=0;//     return-void
a=0;// .end method
}}
