package com.j256.ormlite.dao; class BaseDaoImpl$DaoConfigArray { void a() { int a;
a=0;// .class Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseDaoImpl.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "DaoConfigArray"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private daoArray:[Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "[",
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl",
a=0;//             "<**>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private daoArrayC:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 983
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 984
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;);
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArray:[Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 985
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArrayC:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/j256/ormlite/dao/BaseDaoImpl$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Lcom/j256/ormlite/dao/BaseDaoImpl$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 983
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addDao(Lcom/j256/ormlite/dao/BaseDaoImpl;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl",
a=0;//             "<**>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 988
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/BaseDaoImpl;, "Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     iget v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArrayC:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArray:[Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v3=(Reference,[Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 989
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArray:[Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     new-array v1, v2, [Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 991
a=0;//     .local v1, "newDaoArray":[Lcom/j256/ormlite/dao/BaseDaoImpl;, "[Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     #v1=(Reference,[Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArray:[Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 992
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArray:[Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object v2, v1, v0
a=0;// 
a=0;//     .line 993
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArray:[Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     .line 991
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 995
a=0;//     :cond_0
a=0;//     #v2=(Integer);v3=(Integer);
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArray:[Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     .line 997
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "newDaoArray":[Lcom/j256/ormlite/dao/BaseDaoImpl;, "[Lcom/j256/ormlite/dao/BaseDaoImpl<**>;"
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArray:[Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v2=(Reference,[Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     iget v3, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArrayC:I
a=0;// 
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArrayC:I
a=0;// 
a=0;//     aput-object p1, v2, v3
a=0;// 
a=0;//     .line 998
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1007
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArrayC:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 1008
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArray:[Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-object v2, v1, v0
a=0;// 
a=0;//     .line 1007
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1010
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArrayC:I
a=0;// 
a=0;//     .line 1011
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public get(I)Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;//     .locals 1
a=0;//     .param p1, "i"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I)",
a=0;//             "Lcom/j256/ormlite/dao/BaseDaoImpl",
a=0;//             "<**>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1003
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArray:[Lcom/j256/ormlite/dao/BaseDaoImpl;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/j256/ormlite/dao/BaseDaoImpl;);
a=0;//     aget-object v0, v0, p1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1000
a=0;//     iget v0, p0, Lcom/j256/ormlite/dao/BaseDaoImpl$DaoConfigArray;->daoArrayC:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
