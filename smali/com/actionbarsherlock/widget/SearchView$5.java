package com.actionbarsherlock.widget; class SearchView$5 { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/widget/SearchView$5;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SearchView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnKeyListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/widget/SearchView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/actionbarsherlock/widget/SearchView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/widget/SearchView$5;->this$0:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     .line 924
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/widget/SearchView$5;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
a=0;//     .locals 5
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "keyCode"    # I
a=0;//     .param p3, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 927
a=0;//     #v0=(Null);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView$5;->this$0:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     invoke-static {v2}, Lcom/actionbarsherlock/widget/SearchView;->access$13(Lcom/actionbarsherlock/widget/SearchView;)Landroid/app/SearchableInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 965
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 938
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Reference,Landroid/app/SearchableInfo;);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView$5;->this$0:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/actionbarsherlock/widget/SearchView;->access$11(Lcom/actionbarsherlock/widget/SearchView;)Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->isPopupShowing()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 939
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView$5;->this$0:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     invoke-static {v2}, Lcom/actionbarsherlock/widget/SearchView;->access$11(Lcom/actionbarsherlock/widget/SearchView;)Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getListSelection()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eq v2, v3, :cond_2
a=0;// 
a=0;//     .line 940
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/widget/SearchView$5;->this$0:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     invoke-static {v0, p1, p2, p3}, Lcom/actionbarsherlock/widget/SearchView;->access$14(Lcom/actionbarsherlock/widget/SearchView;Landroid/view/View;ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 945
a=0;//     :cond_2
a=0;//     #v0=(Null);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView$5;->this$0:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     invoke-static {v2}, Lcom/actionbarsherlock/widget/SearchView;->access$11(Lcom/actionbarsherlock/widget/SearchView;)Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->access$0(Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-static {p3}, Landroid/support/v4/view/KeyEventCompat;->hasNoModifiers(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 946
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v1, :cond_3
a=0;// 
a=0;//     .line 947
a=0;//     const/16 v2, 0x42
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne p2, v2, :cond_3
a=0;// 
a=0;//     .line 948
a=0;//     invoke-virtual {p1}, Landroid/view/View;->cancelLongPress()V
a=0;// 
a=0;//     .line 951
a=0;//     iget-object v2, p0, Lcom/actionbarsherlock/widget/SearchView$5;->this$0:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     #v2=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcom/actionbarsherlock/widget/SearchView$5;->this$0:Lcom/actionbarsherlock/widget/SearchView;
a=0;// 
a=0;//     #v4=(Reference,Lcom/actionbarsherlock/widget/SearchView;);
a=0;//     invoke-static {v4}, Lcom/actionbarsherlock/widget/SearchView;->access$11(Lcom/actionbarsherlock/widget/SearchView;)Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/actionbarsherlock/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 952
a=0;//     invoke-interface {v4}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 951
a=0;//     invoke-static {v2, v0, v3, v4}, Lcom/actionbarsherlock/widget/SearchView;->access$15(Lcom/actionbarsherlock/widget/SearchView;ILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 953
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 956
a=0;//     :cond_3
a=0;//     #v0=(Null);v2=(Integer);v3=(Conflicted);v4=(Uninit);
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
