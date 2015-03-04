package com.nineoldandroids.view; class ViewPropertyAnimatorPreHC$PropertyBundle { void a() { int a;
a=0;// .class Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewPropertyAnimatorPreHC.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "PropertyBundle"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mNameValuesHolder:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mPropertyMask:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(ILjava/util/ArrayList;)V
a=0;//     .locals 0
a=0;//     .param p1, "propertyMask"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     .local p2, "nameValuesHolder":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 147
a=0;//     #p0=(Reference,Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;);
a=0;//     iput p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->mPropertyMask:I
a=0;// 
a=0;//     .line 148
a=0;//     iput-object p2, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->mNameValuesHolder:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 149
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method cancel(I)Z
a=0;//     .locals 5
a=0;//     .param p1, "propertyConstant"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     iget v3, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->mPropertyMask:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v3, p1
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->mNameValuesHolder:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->mNameValuesHolder:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 164
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-lt v1, v0, :cond_1
a=0;// 
a=0;//     .line 173
a=0;//     .end local v0    # "count":I
a=0;//     .end local v1    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Boolean);v4=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 165
a=0;//     .restart local v0    # "count":I
a=0;//     .restart local v1    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v3=(Conflicted);v4=(Uninit);
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->mNameValuesHolder:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;
a=0;// 
a=0;//     .line 166
a=0;//     .local v2, "nameValuesHolder":Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;
a=0;//     iget v3, v2, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;->mNameConstant:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, p1, :cond_2
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v3, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->mNameValuesHolder:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 168
a=0;//     iget v3, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->mPropertyMask:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     xor-int/lit8 v4, p1, -0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/2addr v3, v4
a=0;// 
a=0;//     iput v3, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->mPropertyMask:I
a=0;// 
a=0;//     .line 169
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 164
a=0;//     :cond_2
a=0;//     #v3=(Integer);v4=(Uninit);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
